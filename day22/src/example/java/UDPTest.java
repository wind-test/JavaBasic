package example.java;

import org.junit.Test;

import java.net.*;

public class UDPTest {

    //发送端
    @Test
    public void send() throws Exception {

        DatagramSocket ds = new DatagramSocket();

        int i = 0;
        while(i <= 100){
            String str = "我大尚硅谷威武！" + i++;
            byte[] b = str.getBytes();
            DatagramPacket dp = new DatagramPacket(b, 0, b.length, InetAddress.getByName("127.0.0.1"), 9898);

            //发送
            ds.send(dp);
        }

        ds.close();
    }

    //接收端
    @Test
    public void receive() throws Exception {
        DatagramSocket ds = new DatagramSocket(9898);

        byte[] b = new byte[1024];

        int i = 0;

        while(i <= 100){
            DatagramPacket dp = new DatagramPacket(b, 0, b.length);
            ds.receive(dp);

            System.out.println(new String(dp.getData(), 0, dp.getLength()));

            i++;
        }

        ds.close();
    }
}
