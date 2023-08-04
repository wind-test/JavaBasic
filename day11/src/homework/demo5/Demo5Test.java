package homework.demo5;

public class Demo5Test {
    public static void main(String[] args) {
        User[] users = new User[15];
        
        V1Filter v1Filter = new V1Filter();
        V2Filter v2Filter = new V2Filter();
        AFilter aFilter = new AFilter();

        Receptionist recept1 = new Receptionist(v1Filter);
        Receptionist recept2 = new Receptionist(v2Filter);
        Receptionist receptA = new Receptionist(aFilter);


        for (int i = 0; i < users.length; i++) {
            users[i] = new User(i + 1, null);
            
            if (i >= 0 && i < 5) {
                recept1.recept(users[i]);
            }

            if (i >= 5  && i < 10) {
                recept2.recept(users[i]);
            }

            if (i >= 10) {
                receptA.recept(users[i]);
            }
        }

        for (User user: users) {
            System.out.println(user);
        }
    }
}
