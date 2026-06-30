package entities;





public class Drink {
    public String name;
    public double price;
    public int calories;

    public Drink(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

   public void setName(String name) {
        this.name = name;
   }
   public void setPrice(double price) {
        this.price = price;
   }
   public void setCalories(int calories) {
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
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}