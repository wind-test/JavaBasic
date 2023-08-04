package homework.demo5;

public class AFilter implements FilterUser {

    @Override
    public void filterUser(User user) {
        user.setType("A");
    }
}
