package example.io.close;

import java.io.*;

/**
 * @ClassName CloseDemo
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 14时23分48秒
 * @Version 1.0
 *
 * IO关闭的注意事项:
 *      1.关闭IO流遵循先开后关,后开先关的原则
 *      2.处理IO关系时建议使用try...catch语句
 */
public class CloseDemo {
    public static void main(String[] args)  {

    }

    private static void method04(){
        try (
            //创建缓冲字节输入和输出流对象
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("G:\\jdk-8u202-windows-x64.exe"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("G:\\jdk.exe"));
        ) {
            //读写操作

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method03(){
        //创建缓冲字节输入和输出流对象变量
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //创建缓冲字节输入和输出流对象
            bis = new BufferedInputStream(new FileInputStream("G:\\jdk-8u202-windows-x64.exe"));
            bos = new BufferedOutputStream(new FileOutputStream("G:\\jdk.exe"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bis != null) {
                        bis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void method02(){
        //创建文件字节输入和输出流对象变量
        FileInputStream fis = null;
        FileOutputStream fos = null;
        //创建缓冲字节输入和输出流对象变量
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            //创建文件字节输入和输出流对象
            fis = new FileInputStream("G:\\jdk-8u202-windows-x64.exe");
            fos = new FileOutputStream("G:\\jdk.exe");
            //创建缓冲字节输入和输出流对象
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (bis != null) {
                        bis.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (fos != null) {
                            fos.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            if (fis != null) {
                                fis.close();
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    private static void method01() throws IOException {
        //创建文件字节输入和输出流对象
        FileInputStream fis = new FileInputStream("G:\\jdk-8u202-windows-x64.exe");
        FileOutputStream fos = new FileOutputStream("G:\\jdk.exe");
        //创建缓冲字节输入和输出流对象
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //关闭资源
        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }
}
