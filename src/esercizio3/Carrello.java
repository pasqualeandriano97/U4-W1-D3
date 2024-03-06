package esercizio3;

import java.util.Arrays;

public class Carrello {
    private Cliente cliente;
    private Articolo[] articoli;
    private double totale;

    public Carrello(Cliente cliente, Articolo[] articoli) {
        this.cliente = cliente;        this.articoli =articoli;
        this.totale = 0;
        for (Articolo a : articoli) {
            totale += a.getPrezzo();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Carrello{");
        sb.append("cliente=").append(cliente);
        sb.append(", articoli=[");
        for (int i = 0; i < articoli.length; i++) {
            sb.append(articoli[i]);
            if (i < articoli.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        sb.append(", totale=").append(totale);
        sb.append('}');
        return sb.toString();
    }

}
