package runners;

import entities.*;
import interfaces.ElementoMenu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import Enum.StatoTavolo;
import Enum.StatoOrdine;

@Component
public class OrdineRunner implements CommandLineRunner, ApplicationContextAware {

    private ApplicationContext ctx;

    @Value("${coperto.price}")
    private double prezzoCoperto;

    @Override
    public void setApplicationContext(ApplicationContext ctx) {
        this.ctx = ctx;
    }

    @Override
    public void run(String... args) throws Exception {


        PubMenu menu = ctx.getBean(PubMenu.class);
        menu.stampaMenu();

        List<ElementoMenu> elementi = new ArrayList<>();
        elementi.add(menu.pizzas.get(0));

        Tavoli t = new Tavoli(1, 4, StatoTavolo.LIBERO);

        Ordini ordine = new Ordini(1, StatoOrdine.IN_CORSO, 2, LocalTime.now(), t, elementi, prezzoCoperto);

        System.out.println("Totale: " + ordine.calcolaTotale());
    }
}