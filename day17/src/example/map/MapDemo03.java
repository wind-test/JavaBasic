package example.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MapDemo03
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月16日 11时50分47秒
 * @Version 1.0
 *
 * Map集合的遍历方式2:键值对对象
 *
 * Map.Entry接口
 *      接口的特点
 *          映射项（键-值对）。
 *      接口的位置
 *          java.util
 *      接口的方法
 *          K getKey()
 *              返回与此项对应的键。
 *          V getValue()
 *              返回与此项对应的值
 */
public class MapDemo03 {
    public static void main(String[] args) {
        //使用多态的形式创建Map集合对象
        Map<String,String> map = new LinkedHashMap<>();

        //添加元素
        map.put("探险家","伊泽瑞尔");
        map.put("光辉女郎","拉克丝");
        map.put("蛮族之王","泰达米尔");
        map.put("寒冰射手","艾希");

        //获取键值对的集合
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            //根据键值对对象获取key
            String key = entry.getKey();
            //根据键值对对象获取value
            String value = entry.getValue();

            System.out.println(key + "=" + value);
        }
    }
}
