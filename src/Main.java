import entities.ESERCIZIO2.Chiamata;
import entities.ESERCIZIO2.Sim;
import entities.ESERCIZIO3.Articolo;
import entities.ESERCIZIO3.Carrello;
import entities.ESERCIZIO3.Cliente;
import entities.Rettangolo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rettangolo r = new Rettangolo(2, 4);
        Rettangolo.stampaRettangolo(r);

        Rettangolo r1 = new Rettangolo(5, 8);
        Rettangolo r2 = new Rettangolo(3, 6);
        Rettangolo.stampaDueRettangoli(r1, r2);

        Chiamata[] listaChiamate = new Chiamata[5];
        listaChiamate[0] = new Chiamata("33112345980", 2.8);
        listaChiamate[1] = new Chiamata("33112345347", 3.9);
        listaChiamate[2] = new Chiamata("33112345432", 15.7);
        listaChiamate[3] = new Chiamata("33131345265", 7.3);
        listaChiamate[4] = new Chiamata("33112345832", 23.4);

        Sim numeroTelefono = new Sim("33112345678", 0, listaChiamate);

        numeroTelefono.stampaSim();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Cliente cliente = new Cliente("Arianna", "Loreti", "arianna@mail.com", "24 luglio 2024", 637819);
        cliente.stampaDatiCliente();


        Articolo[] elencoArticoli = new Articolo[3];
        elencoArticoli[0] = new Articolo(82912, "Giacca Karpos", 79.99, 10);
        elencoArticoli[1] = new Articolo(74821, "Scarpe Garmont", 100.99, 15);
        elencoArticoli[2] = new Articolo(87124, "Pile Montura", 55.99, 7);
        Carrello carrello = new Carrello("AriannaLoreti", 0.0, elencoArticoli);
        carrello.stampaCarrello();
    }
}