package example.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @ClassName MapDemo04
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月16日 11时57分06秒
 * @Version 1.0
 *
 * Map集合的遍历方式3:forEach()
 *
 */
public class MapDemo04 {
    public static void main(String[] args) {
        //使用多态的形式创建Map集合对象
        Map<String,String> map = new LinkedHashMap<>();

        //添加元素
        map.put("探险家","伊泽瑞尔");
        map.put("光辉女郎","拉克丝");
        map.put("蛮族之王","泰达米尔");
        map.put("寒冰射手","艾希");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "=" + value);
            }
        });
    }
}
