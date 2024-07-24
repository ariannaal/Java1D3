package entities.ESERCIZIO3;

public class Cliente {

    //ATTRIBUTI
    private long codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private String dataIscrizione;

    public Cliente(String nome, String cognome, String email, String dataIscrizione, long codiceCliente) {
        this.codiceCliente = codiceCliente;
        this.dataIscrizione = dataIscrizione;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public long getCodiceCliente() {
        return codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void stampaDatiCliente() {
        System.out.println("INFO CLIENTE");
        System.out.println("Codice Cliente: " + codiceCliente);
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Email: " + email);
        System.out.println("Data Iscrizione: " + dataIscrizione);
    }

}
