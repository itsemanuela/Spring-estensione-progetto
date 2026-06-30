package entities;
import Enum.StatoTavolo;

public class Tavoli {

    private int numero;
    private int copertiMax;
    private StatoTavolo stato;

    public Tavoli(int numero, int copertiMax, StatoTavolo stato) {
        this.numero = numero;
        this.copertiMax = copertiMax;
        this.stato = stato;
    }


    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCopertiMax() {
        return copertiMax;
    }
    public void setCopertiMax(int copertiMax) {
        this.copertiMax = copertiMax;
    }
    public StatoTavolo getStato() {
        return stato;
    }
    public void setStato(StatoTavolo stato) {
        this.stato = stato;
    }


    @Override
    public String toString() {
        return "Tavoli{" +
                "numero=" + numero +
                ", copertiMax=" + copertiMax +
                ", stato=" + stato +
                '}';
    }
}
