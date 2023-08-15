package example.java;

public class Creature<T> {

    public String color;
    private Integer legs;

    public Creature() {
    }

    public Creature(String color, Integer legs) {
        this.color = color;
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }
}
