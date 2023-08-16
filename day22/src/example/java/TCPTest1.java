package example.java;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
1.客户端发送内容给服务端，服务端将内容打印到控制台上。
*/
public class TCPTest1 {

    //客户端
    @Test
    public void client(){
        String str = "我大尚硅谷威武！";

        //一个IP地址和一个端口号的组合形成 Socket 套接字
        Socket s = null;
        OutputStream os = null;
        try {
            s = new Socket(InetAddress.getByName("127.0.0.1"), 9898);

            os = s.getOutputStream();

            os.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(s != null){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    //服务端
    @Test
    public void server(){
        ServerSocket ss = null;
        Socket s = null;
        InputStream in = null;
        try {
            ss = new ServerSocket(9898);

            //处于阻塞状态用于接收当前连接的 Socket
            s = ss.accept();

            in = s.getInputStream();

            byte[] b = new byte[1024];
            int len = 0;

            while((len = in.read(b)) != -1){
                System.out.println(new String(b, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if(in != null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(s != null){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
