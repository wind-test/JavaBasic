package example.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName MapDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月16日 11时44分41秒
 * @Version 1.0
 *
 * Map集合的遍历方式1:键找值
 */
public class MapDemo02 {
    public static void main(String[] args) {
        //使用多态的形式创建Map集合对象
        Map<String,String> map = new LinkedHashMap<>();

        //添加元素
        map.put("探险家","伊泽瑞尔");
        map.put("光辉女郎","拉克丝");
        map.put("蛮族之王","泰达米尔");
        map.put("寒冰射手","艾希");

        //获取Map的键集
        Set<String> keys = map.keySet();

        //遍历键集
        for (String key : keys) {
            //根据key获取value
            String value = map.get(key);

            System.out.println(key + "=" + value);
        }
    }
}
