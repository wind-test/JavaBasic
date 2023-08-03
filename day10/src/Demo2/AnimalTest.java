package Demo2;

/**
 * @FileName AnimalTest
 * @Description
 * @Author WindDancer
 * @date 2023-08-03
 **/
public class AnimalTest {
  public static void main(String[] args) {
    Dog dog = new Dog((short) 5, Animal.Color.BLACK);
    Cat cat = new Cat((short) 3, Animal.Color.YELLOW);

    dog.eat("骨头");
    cat.eat("鱼");

    Person person = new Person("晓霞", (short) 18);
    person.keepCat(cat, "丸子");
    person.keepDog(dog, "肉");
  }
}
