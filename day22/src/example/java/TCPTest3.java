package example.java;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
3.从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。并关闭相应的连接。
 */
public class TCPTest3 {

    //客户端
    @Test
    public void client() throws IOException {
        Socket s = new Socket(InetAddress.getByName("127.0.0.1"), 9898);
        FileInputStream fis = new FileInputStream("1.jpg");

        //客户端发送图片给服务端
        OutputStream os = s.getOutputStream();

        byte[] b = new byte[1024];
        int len = 0;
        while((len = fis.read(b)) != -1){
            os.write(b, 0, len);
        }

        s.shutdownOutput();

        //接收服务端反馈
        InputStream in = s.getInputStream();

        while((len = in.read(b)) != -1){
            System.out.println(new String(b, 0, len));
        }

        in.close();
        os.close();
        fis.close();
        s.close();
    }

    //服务端
    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(9898);
        Socket s = ss.accept();

        FileOutputStream fos = new FileOutputStream("2.jpg");

        InputStream in = s.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        while((len = in.read(b)) != -1){
            fos.write(b, 0, len);
        }

        //发送反馈
        OutputStream os = s.getOutputStream();
        os.write("接收好看的图片成功".getBytes());

        os.close();
        in.close();
        fos.close();
        s.close();
        ss.close();
    }

}
