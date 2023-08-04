package homework.demo5;

public class Receptionist {
    private FilterUser filter;

    public Receptionist(FilterUser filter) {
        this.filter = filter;
    }

    public FilterUser getFilter() {
        return filter;
    }

    public void setFilter(FilterUser filter) {
        this.filter = filter;
    }

    public void recept(User user) {
        if (user.getType() != null) {
            return;
        }
        filter.filterUser(user);
    }
}
