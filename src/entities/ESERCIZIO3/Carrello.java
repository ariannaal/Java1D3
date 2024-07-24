package entities.ESERCIZIO3;

public class Carrello {

    //ATTRIBUTI
    private String clienteAssociato;
    private Articolo[] elencoArticoli;
    private double prezzoTotale;

    public Carrello(String clienteAssociato, double prezzoTotale, Articolo[] elencoArticoli) {
        this.clienteAssociato = clienteAssociato;
        this.prezzoTotale = 0;
        this.elencoArticoli = elencoArticoli;
    }

    public String getClienteAssociato() {
        return clienteAssociato;
    }

    public Articolo[] getElencoArticoli() {
        return elencoArticoli;
    }

    public double getPrezzoTotale() {
        return prezzoTotale;
    }

    //per aggiungere articoli
    public void stampaCarrello() {
        System.out.println("ARTICOLI NEL CARRELLO");

        for (int i = 0; i < elencoArticoli.length; i++) {

            System.out.println("Articolo nr. " + i + " codice articolo: " + elencoArticoli[i].getCodiceArticolo() + " Nome articolo: " + elencoArticoli[i].getDescrizioneArticolo() + "prezzo: " + elencoArticoli[i].getPrezzoArticolo() + "pezzi disponibili in magazzino " + elencoArticoli[i].getPezziDisponibili() + "prezzo totale " + (prezzoTotale += elencoArticoli[i].getPrezzoArticolo()));
        }
    }
}
