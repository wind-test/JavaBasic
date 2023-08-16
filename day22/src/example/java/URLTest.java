package example.java;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

    @Test
    public void test1() throws Exception {
//        URL url = new URL("http://192.168.17.66/atguigu/hello.txt");

        URL url = new URL("https://down.sandai.net/thunder11/XunLeiWebSetup11.3.12.1932gw.exe");

        /*
        public String getProtocol(  )     获取该URL的协议名
        public String getHost(  )           获取该URL的主机名
        public String getPort(  )            获取该URL的端口号
        public String getPath(  )           获取该URL的文件路径
        public String getFile(  )             获取该URL的文件名
        public String getRef(  )             获取该URL在文件中的相对位置
        public String getQuery(   )        获取该URL的查询名
         */

        /*System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getPath());
        System.out.println(url.getFile());
        System.out.println(url.getRef());
        System.out.println(url.getQuery());*/

        /*InputStream in = url.openStream();

        byte[] b = new byte[1024];
        int len = 0;
        while((len = in.read(b)) != -1){
            System.out.println(new String(b, 0, len));
        }

        in.close();*/

        //URLConnection 代表与指定站点的连接
        URLConnection uc = url.openConnection();

        InputStream in = uc.getInputStream();
        FileOutputStream fos = new FileOutputStream("D:/1.exe");

        byte[] b = new byte[1024];
        int len = 0;
        while((len = in.read(b)) != -1){
            fos.write(b, 0, len);
        }

        fos.close();
        in.close();
    }

}
