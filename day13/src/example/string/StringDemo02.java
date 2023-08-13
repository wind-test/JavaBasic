package example.string;

/**
 * @ClassName StringDemo02
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2022年07月11日 09时56分43秒
 * @Version 1.0
 *
 * String类判断功能的方法:
 *      public boolean equals (Object anObject)
 *          将此字符串与指定对象进行比较。
 *      public boolean equalsIgnoreCase (String anotherString)
 *          将此字符串与指定对象进行比较，忽略大小写。
 *      public boolean contains(CharSequence s)
 *          当且仅当此字符串包含指定的 char 值序列时，返回 true。
 * 		public boolean endsWith(String suffix)
 * 	   	    测试此字符串是否以指定的后缀结束。
 * 		public boolean isEmpty()
 * 	        当且仅当 length() 为 0 时返回 true。
 * 		public boolean startsWith(String prefix)
 * 	   	    测试此字符串是否以指定的前缀开始。
 * 	   	public boolean startsWith(String prefix,int toffset)
 * 	   	    测试此字符串从指定索引开始的子字符串是否以指定前缀开始。
 */
public class StringDemo02 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = new String("ABC");
        String str4 = new String("cba");
        String str5 = "abcdefg";

        //判断字符串的内容是否相等,且区分大小写
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));

        System.out.println("==================");

        //判断字符串的内容是否相等,且不区分大小写
        System.out.println(str1.equalsIgnoreCase(str2));//abc和abc
        System.out.println(str1.equalsIgnoreCase(str3));//abc和ABC
        System.out.println(str1.equalsIgnoreCase(str4));//abc和cba

        System.out.println("==================");

        //判断当前字符串对象是否包含指定字符串对象
        System.out.println(str5.contains("def"));
        System.out.println(str5.contains("HelloWorld"));

        System.out.println("==================");

        //判断当前字符串对象是否以指定字符串作为结尾
        System.out.println(str5.endsWith("defg"));
        System.out.println(str5.endsWith("HelloWorld"));

        System.out.println("==================");

        //判断当前字符串对象是否长度为0
        System.out.println("".isEmpty());
        System.out.println(str5.isEmpty());

        System.out.println("==================");

        //判断当前字符串对象是否以指定字符串作为开始
        System.out.println(str5.startsWith("abc"));
        System.out.println(str5.startsWith("HelloWorld"));

        System.out.println("==================");

        //判断当前字符串从指定索引开始的子字符串对象是否以指定字符串作为开始
        System.out.println(str5.startsWith("def",3));//defg
        System.out.println(str5.startsWith("abc",3));
    }
}
