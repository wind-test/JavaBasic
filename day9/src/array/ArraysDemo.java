package array;

import java.util.Arrays;

/**
 * @ClassName ArraysDemo
 * @Description 此类用于演示功能
 * @Author WindDancer
 * @DateTime 2022年07月05日 11时35分51秒
 * @Version 1.0
 */
public class ArraysDemo {
  public static void main(String[] args) {
    //声明并初始化数组
    int[] arr1 = {5,4,6,8,9,0,1,2,7,3};
    String[] arr2 = {"cba","bac","acb","cab","abc","bca","尚硅谷","0","ABC"};

    Student stu1 = new Student("城小将",15);
    Student stu2 = new Student("唐小妃",18);
    Student stu3 = new Student("李小白",17);
    Student stu4 = new Student("波斯客",13);

    Student[] arr3 = {stu1,stu2,stu3,stu4};

    //以固定格式打印数组中元素
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    System.out.println(Arrays.toString(arr3));

    System.out.println("===========================================");

    //以指定的长度复制新数组
    int[] newArr1 = Arrays.copyOf(arr1, 5);
    int[] newArr2 = Arrays.copyOf(arr1, 15);
    String[] newArr3 = Arrays.copyOf(arr2,10);

    System.out.println(Arrays.toString(newArr1));
    System.out.println(Arrays.toString(newArr2));
    System.out.println(Arrays.toString(newArr3));

    System.out.println("===========================================");

    //使用二分查找方式查询指定元素出现的第一次索引
    int index = Arrays.binarySearch(arr1, 5);
    System.out.println("index = " + index);

    System.out.println("===========================================");

    //针对数组进行排序
    Arrays.sort(arr1);
    System.out.println(Arrays.toString(arr1));

    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr2));

    Arrays.sort(arr3);
    System.out.println(Arrays.toString(arr3));
  }
}



