package entities;


import java.util.List;

public class PubMenu {
    public List<Toppings> toppings;
    public List<Pizza> pizzas;
    public List<Drink> drinks;

    public PubMenu(String name, double price, int calories, List<Toppings> toppings,  List<Pizza> pizzas, List<Drink> drinks) {
        this.toppings = toppings;
        this.pizzas = pizzas;
        this.drinks = drinks;


    }


    public void stampaMenu() {
        System.out.println("----- MENU -----");
        System.out.println("PIZZE:");
        pizzas.forEach(System.out::println);

        System.out.println("\nDRINK:");
        drinks.forEach(System.out::println);

        System.out.println("\nTOPPINGS:");
        toppings.forEach(System.out::println);
        System.out.println("----------------");
    }

    @Override
    public String toString() {
        return "Menu{" +
                "toppings=" + toppings +
                ", pizzas=" + pizzas +
                ", drinks=" + drinks +
                '}';
    }


}
