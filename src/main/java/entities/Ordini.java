package entities;

import Enum.StatoOrdine;
import interfaces.ElementoMenu;

import java.time.LocalTime;
import java.util.List;

public class Ordini  {

    private int numeroOrdine;
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalTime oraAcquisizione;
    private Tavoli tavoli;
    private List<ElementoMenu> elementoMenus;
    private double costoCoperto;

    public Ordini(int numeroOrdine,
                  StatoOrdine stato,
                  int numeroCoperti,
                  LocalTime oraAcquisizione,
                  Tavoli tavoli,
                  List<PubMenu> elementi,
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

    }

