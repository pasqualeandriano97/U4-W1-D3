package esercizio3;

import java.util.Random;

public class Articolo {
    private int id;
    private String descrizione;
    private double prezzo;
    private int quantita;

    public Articolo( String descrizione, double prezzo, int quantita) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 10000) ;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public double getPrezzo() {
        return prezzo*quantita;
    }

    @Override
    public String toString() {
        return "Articolo{" +
                "id=" + id +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", quantita=" + quantita +
                '}';
    }
}
