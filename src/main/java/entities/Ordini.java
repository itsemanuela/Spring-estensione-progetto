package entities;

import Enum.StatoOrdine;
import interfaces.ElementoMenu;


import java.time.LocalTime;
import java.util.List;

public class Ordini  {


    private double costoCoperto;

    private int numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalTime oraAcquisizione;
    private Tavoli tavoli;
    private List<ElementoMenu> elementoMenus;


    public Ordini(int numeroOrdine,
                  StatoOrdine stato,
                  int numeroCoperti,
                  LocalTime oraAcquisizione,
                  Tavoli tavoli,
                  List<ElementoMenu> elementoMenus,
                  double costoCoperto) {

        this.numeroOrdine = numeroOrdine;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = oraAcquisizione;
        this.tavoli = tavoli;
        this.elementoMenus = elementoMenus;
        this.costoCoperto = costoCoperto;
    }
public  int getNumeroOrdine() {
    return numeroOrdine;
}
public void setNumeroOrdine(int numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
}
public StatoOrdine getStato() {
    return stato;
}

public void setStato(StatoOrdine stato) {
        this.stato = stato;
}
public int getNumeroCoperti() {
        return numeroCoperti;
}
public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
}
public LocalTime getOraAcquisizione() {
        return oraAcquisizione;
}
public Tavoli getTavoli() {
        return tavoli;
}
public void setTavoli(Tavoli tavoli) {
        this.tavoli = tavoli;
}
public List<ElementoMenu> getElementoMenus() {
        return elementoMenus;
}
public void setElementoMenus(List<ElementoMenu> elementoMenus) {
        this.elementoMenus = elementoMenus;
}
public double getCostoCoperto() {
        return costoCoperto;
}
public void setCostoCoperto(double costoCoperto) {
        this.costoCoperto = costoCoperto;
}


    public double calcolaTotale() {
        // sommo il prezzo di tutti gli elementi con l'interfaccia
        double sommaElementi = elementoMenus.stream()
                .mapToDouble(ElementoMenu::getPrezzo)
                .sum();

        // sommo il costo del coperto moltiplicato per il numero di persone
        return sommaElementi + (this.numeroCoperti * this.costoCoperto);
    }
    public void stampaDettaglioOrdine() {
        System.out.println("----------------------------------------");
        System.out.println("RIEPILOGO ORDINE N. " + this.numeroOrdine);
        System.out.println("----------------------------------------");

        //  ora
        System.out.println("Ora acquisizione: " + this.oraAcquisizione);

        //  stato e tavolo
        System.out.println("Stato: " + this.stato);
        System.out.println("Tavolo numero: " + this.tavoli.getNumero());

        //  coperti
        System.out.println("Numero coperti: " + this.numeroCoperti);

        System.out.println("Articoli ordinati:");

        for (ElementoMenu e : elementoMenus) {
            System.out.println("- " + e.getNome() + ": " + e.getPrezzo() + " Euro");
        }

        System.out.println("----------------------------------------");
        System.out.println("TOTALE COMPLESSIVO: " + this.calcolaTotale() + " Euro");
        System.out.println("----------------------------------------");
    }
    

    @Override
    public String toString() {
        return "Ordini{" +
                "costoCoperto=" + costoCoperto +
                ", numeroOrdine=" + numeroOrdine +
                ", stato=" + stato +
                ", numeroCoperti=" + numeroCoperti +
                ", oraAcquisizione=" + oraAcquisizione +
                ", tavoli=" + tavoli +
                ", elementoMenus=" + elementoMenus +
                '}';
    }
}



