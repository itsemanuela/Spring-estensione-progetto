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

        // --- PRIMO ORDINE ---
        List<ElementoMenu> lista1 = new ArrayList<>();
        lista1.add(menu.pizzas.get(0)); // Aggiunge margherita

        Tavoli t1 = new Tavoli(1, 4, StatoTavolo.LIBERO);

        Ordini ordine1 = new Ordini(1, StatoOrdine.IN_CORSO, 2, LocalTime.now(), t1, lista1, prezzoCoperto);
        ordine1.stampaDettaglioOrdine();

        // --- SECONDO ORDINE ---
        List<ElementoMenu> lista2 = new ArrayList<>();
        lista2.add(menu.pizzas.get(1)); //   hawaiana
        lista2.add(menu.drinks.get(0)); //  acqua

        Tavoli t2 = new Tavoli(2, 2, StatoTavolo.LIBERO);

        Ordini ordine2 = new Ordini(2, StatoOrdine.SERVITO, 4, LocalTime.now(), t2, lista2, prezzoCoperto);
        ordine2.stampaDettaglioOrdine();
    }
}