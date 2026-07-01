import entities.*;
import interfaces.ElementoMenu;
import org.junit.jupiter.api.BeforeEach;
import Enum.StatoTavolo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Enum.StatoOrdine;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OrdiniTest {
    private Tavoli tavoli;
    private double costoCoperto = 2.50;

// faccio il setup del tavolo prima di ogni test con @BeforeEach in modo che non debba ripetermi
    //e ripristino il tavolo prima di ogni test

    @BeforeEach
    public void setup() {
        tavoli= new Tavoli(5,4, StatoTavolo.LIBERO);
    }

    //test metodo che mi somma il prezzo della pizza e il prezzo dei coperti
    @Test
    @DisplayName("calcolo_costo_pizza_piu_costo_coperto_sommo")
    void calcoloTotalePizzaCoperto(){
        List<ElementoMenu> lista = new ArrayList<ElementoMenu>();
        lista.add(new Pizza("margherita doppia", 12.00, 980, new ArrayList<>()));
        int numeroCoperti= 2;
        Ordini ordine = new Ordini(12, StatoOrdine.IN_CORSO, numeroCoperti, LocalTime.now(), tavoli, lista, costoCoperto);
        double totale= ordine.calcolaTotale();

        // mi aspetto (12.00 + 5)
       assertEquals(17, totale, 0.01); //delta x num decimale
    }

    @Test
    @DisplayName("calcolo_costo_ordine_pizza_piu_drink")
    void calcoloTotalePizzaDrink(){
        List<ElementoMenu> listaMista=  new ArrayList<>();
        listaMista.add(new Pizza("marinara", 6.50, 450, new ArrayList<>()));
        listaMista.add(new Drink("birra", 7.50, 350));
        int numeroCoperti2= 5;

        Ordini ordini= new Ordini(10, StatoOrdine.IN_CORSO, numeroCoperti2, LocalTime.now(), tavoli, listaMista, costoCoperto );

        double totale= ordini.calcolaTotale();
        assertEquals(26.50, totale, 0.01);
    }


    //calcolo pizza, drink e toppings senza coperto
    @Test
    @DisplayName("calcolo_pizza_drink_toppings_senza_coperto")
            void calcoloSenzaCoperto(){
        List<ElementoMenu> listaNoCoperto= new ArrayList<>();
        listaNoCoperto.add(new Pizza("capricciosa", 9.50, 1250, new ArrayList<>()));
        listaNoCoperto.add(new Drink("vino", 16.50, 850));
        listaNoCoperto.add(new Toppings("funghi_chiodini", 3.50, 170));

        Ordini ordini= new Ordini(4, StatoOrdine.IN_CORSO, 0, LocalTime.now(), tavoli, listaNoCoperto, costoCoperto);
        double  totaleNoCoperto= ordini.calcolaTotale();

        assertEquals(29.50, totaleNoCoperto, 0.01);


    }

    @Test
    @DisplayName("metodo_senza_hardcodare_prezzi")
    void calcoloDinamico(){
        List<ElementoMenu> listaDinamica= new ArrayList<>();
        Pizza pizza1 = new Pizza("marinara", 10.50, 450, new ArrayList<>());
        Drink drink1= new Drink("vino", 6.50, 850) ;
        Toppings top=new Toppings("funghi_chiodini", 3.50, 170);

        listaDinamica.add(pizza1);
        listaDinamica.add(drink1);
        listaDinamica.add(top);

        Ordini ordineDinamico= new Ordini(4, StatoOrdine.IN_CORSO, 0, LocalTime.now(), tavoli,listaDinamica, costoCoperto);

        double tot_atteso= pizza1.getPrezzo() + drink1.getPrezzo() + top.getPrezzo();
        double totale= ordineDinamico.calcolaTotale();

        assertEquals(tot_atteso, totale, 0.01);

    }

}
