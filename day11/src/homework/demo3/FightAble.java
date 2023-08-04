package homework.demo3;

public interface FightAble {
  void specialFight();
  default void commonFight() {
    System.out.println("普通攻击");
  }
}
