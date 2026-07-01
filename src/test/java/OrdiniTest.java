import entities.Drink;
import entities.Ordini;
import entities.Pizza;
import entities.Tavoli;
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


}
