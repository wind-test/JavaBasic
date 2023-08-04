package homework.demo5;

public class V2Filter implements FilterUser {

    @Override
    public void filterUser(User user) {
        user.setType("V2");
    }
}

