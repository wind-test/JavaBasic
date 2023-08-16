package example.java;

import com.sun.security.ntlm.Server;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
2.客户端发送内容给服务端，服务端给予反馈。
 */
public class TCPTest2 {

    //客户端
    @Test
    public void client() throws IOException { //我使用 throws 但是你们得 try-catch
        String str = "我大尚硅谷威武！Hello！";

        Socket s = new Socket(InetAddress.getByName("127.0.0.1"), 9898);

        //发送数据给服务端
        OutputStream os = s.getOutputStream();
        os.write(str.getBytes());

        s.shutdownOutput();//通知服务端发送完毕

        //接收服务端的反馈
        InputStream in = s.getInputStream();

        byte[] b = new byte[1024];
        int len = 0;

        while((len = in.read(b)) != -1){
            System.out.println(new String(b, 0, len));
        }

        in.close();
        os.close();
        s.close();
    }

    //服务端
    @Test
    public void server() throws IOException {
        ServerSocket ss = new ServerSocket(9898);
        Socket s = ss.accept();

        //接收客户端数据
        InputStream in = s.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        while((len = in.read(b)) != -1){
            System.out.println(new String(b, 0, len));
        }

        //发送反馈给客户端
        OutputStream os = s.getOutputStream();
        os.write("接收成功!".getBytes());

        os.close();
        in.close();
        s.close();
        ss.close();
    }

}
