package entities.ESERCIZIO3;

public class Articolo {

    private long codiceArticolo;
    private String descrizioneArticolo;
    private double prezzoArticolo;
    private int pezziDisponibili;


    //COSTRUTTORI
    public Articolo(long codiceArticolo, String descrizioneArticolo, double prezzoArticolo, int pezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzoArticolo = prezzoArticolo;
        this.pezziDisponibili = pezziDisponibili;
    }

    public long getCodiceArticolo() {
        return codiceArticolo;
    }

    public String getDescrizioneArticolo() {
        return descrizioneArticolo;
    }

    public double getPrezzoArticolo() {
        return prezzoArticolo;
    }

    public int getPezziDisponibili() {
        return pezziDisponibili;
    }
}
