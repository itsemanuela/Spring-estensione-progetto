package entities;



import java.util.List;

public class Pizza {

    private String name;
    private double price;
    private int calories;
    private List<String> toppings;

    public Pizza(String name, double price, int calories, List<String> toppings) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.toppings = toppings;


    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public List<String> getToppings() {
        return toppings;
    }
    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                ", toppings=" + toppings +
                '}';
    }

}
