package example.java;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
一、网络通信的两点要素

1、确定通信双方的地址
    > IP 地址  如：125.76.247.133
    > 域名  如：www.atguigu.com


2、若需要可靠高效的完成通络通信，需要满足一定的规则，即网络通信协议（TCP、UDP）


 */
public class InetAddressTest {

    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia1 = InetAddress.getByName("www.atguigu.com");
        System.out.println(ia1);

        String hostName = ia1.getHostName();
        String hostAddress = ia1.getHostAddress();

        System.out.println(hostName);
        System.out.println(hostAddress);

        InetAddress ia2 = InetAddress.getByName("120.27.139.174");
        System.out.println(ia2);
    }

}
