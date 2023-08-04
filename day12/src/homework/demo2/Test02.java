package homework.demo2;

/*
 * 考核知识点：实例初始化方法，属性与多态无关
 * 输出结果
 * Son.x = 0
 * Son.x = 30
 * 20
 */
public class Test02 {
  public static void main(String[] args) {
    Father f = new Son();
    System.out.println(f.x);
  }
}
class Father{
  int x = 10;
  public Father(){
    this.print();
    x = 20;
  }
  public void print(){
    System.out.println("Father.x = " + x);
  }
}
class Son extends Father{
  int x = 30;
  public Son(){
    this.print();
    x = 40;
  }
  public void print(){
    System.out.println("Son.x = " + x);
  }
}