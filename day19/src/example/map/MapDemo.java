package example.map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName MapDemo
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月19日 15时11分27秒
 * @Version 1.0
 *
 * Properties类
 *      类的特点
 *          Properties 类表示了一个持久的属性集。
 *          Properties 可保存在流中或从流中加载。
 *          属性列表中每个键及其对应值都是一个字符串。
 *      类的位置
 *          java.util
 *      类的构造器
 *          public Properties()
 *              创建一个无默认值的空属性列表。
 *      类的方法
 *          public void load(InputStream inStream)
 *              从输入流中读取属性列表（键和元素对）。
 *          public void load(Reader reader)
 *              按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
 *          public Set<String> stringPropertyNames()
 *              返回此属性列表中的键集，其中该键及其对应值是字符串，如果在主属性列表中未找到同名的键，则还包括默认属性列表中不同的键。
 *          public String getProperty(String key)
 *              用指定的键在此属性列表中搜索属性。
 */
public class MapDemo {
    public static void main(String[] args) throws IOException {
        //创建属性集文件对象
        Properties pro = new Properties();

        //从"配置文件"中加载键值对到属性集对象中
        pro.load(new FileInputStream("/Users/winddancer/Documents/MyCodes/JavaBasic/day19/src/example/map/pro.properties"));

        //遍历Properties属性集对象
        Set<String> keys = pro.stringPropertyNames();

        //遍历键集
        for (String key : keys) {
            //通过键获取值
            String value = pro.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
