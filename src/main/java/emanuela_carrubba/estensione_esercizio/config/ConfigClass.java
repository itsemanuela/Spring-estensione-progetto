package emanuela_carrubba.estensione_esercizio.config;


import entities.PubMenu;
import entities.Drink;
import entities.Pizza;
import entities.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class ConfigClass {

    @Bean
    public Pizza margherita() {
        return new Pizza("margherita", 6.50, 450, List.of("mozzarella", "pomodoro"));
    }

    @Bean
    public Pizza hawaiana() {
        return new Pizza("hawaiana", 20.50, 570, List.of("prosciutto", "ananas", "mozzarella"));
    }

    @Bean
    public Pizza mimosa() {
        return new Pizza("mimosa", 7.50, 670, List.of("mozzarella", "mais", "prosciutto", "panna"));
    }


    @Bean
    public Pizza salami() {
        return new Pizza("salami", 8.99, 1024, List.of("mozzarella", "pomodoro", "salame", "olive"));
    }


    @Bean
    public Toppings formaggio() {
        return new Toppings("formaggio", 2.00, 120);
    }

    @Bean
    public Toppings prosciutto() {
        return new Toppings("prosciutto", 2.00, 100);
    }

    @Bean
    public Toppings ananas() {
        return new Toppings("ananas", 2.00, 120);
    }

    @Bean
    public Toppings cipolla() {
        return new Toppings("cipolla", 1.00, 70);
    }

    @Bean
    public Toppings salame() {
        return new Toppings("salame", 2.00, 270);
    }

    @Bean
    public Drink acqua(){
        return new Drink("acqua", 1.50, 0);
    }

    @Bean
    public  Drink limonata(){
        return new Drink("limonata", 4.50, 230);
    }
    @Bean
    public Drink vino(){
        return new Drink("vino", 45.50, 350);
    }

    @Bean
    public PubMenu pubMenu(
            Pizza margherita,
            Pizza hawaiana,
            Pizza mimosa,
            Pizza salami,
            Drink acqua,
            Drink limonata,
            Drink vino,
            Toppings formaggio,
            Toppings prosciutto,
            Toppings ananas,
            Toppings cipolla,
            Toppings salame) {

        return new PubMenu(
                "",
                0,
                0,
                List.of(
                        formaggio,
                        prosciutto,
                        ananas,
                        cipolla,
                        salame
                ),
                List.of(
                        margherita,
                        hawaiana,
                        mimosa,
                        salami
                ),
                List.of(
                        acqua,
                        limonata,
                        vino
                )
        );
    }
    }





