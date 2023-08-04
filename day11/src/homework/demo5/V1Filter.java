package homework.demo5;

public class V1Filter implements FilterUser {

    @Override
    public void filterUser(User user) {
        user.setType("V1");
    }
}
