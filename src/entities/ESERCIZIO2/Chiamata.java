package entities.ESERCIZIO2;

public class Chiamata {


    //ATTRIBUTI
    private String numeroChiamato;
    private double durataChiamata;

    //COSTRUTTORI
    public Chiamata(String numeroChiamato, double durataChiamata) {
        this.numeroChiamato = numeroChiamato;
        this.durataChiamata = durataChiamata;
    }

    public double getDurataChiamata() {
        return durataChiamata;
    }

    public String getNumeroChiamato() {
        return numeroChiamato;
    }


}
