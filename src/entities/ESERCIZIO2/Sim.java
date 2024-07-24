package entities.ESERCIZIO2;

public class Sim {

    //ATTRIBUTI
    private String numeroTelefono;
    private double creditoDisponibile;
    private Chiamata[] listaChiamate;

    //COSTRUTTORI
    public Sim(String numeroTelefono, double creditoDisponibile, Chiamata[] listaChiamate) {

        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = creditoDisponibile;
        this.listaChiamate = listaChiamate;

    }

    public void stampaSim() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + creditoDisponibile);

        for (int i = 0; i < listaChiamate.length; i++) {

            System.out.println("Chiamata nr. " + i + " numero: " + listaChiamate[i].getNumeroChiamato() + " durata: " + listaChiamate[i].getDurataChiamata() + "minuti");
        }


    }

    //METODI

    public Chiamata[] getListaChiamate() {
        return listaChiamate;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCreditoDisponibile() {
        return creditoDisponibile;
    }


}
