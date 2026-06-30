package entities;


public class Toppings {
    private final String name;
    private final double price;
    private final int calories;

    public Toppings(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }


    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getCalories() {
        return calories;
    }


    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}
