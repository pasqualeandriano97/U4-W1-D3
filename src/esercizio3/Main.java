package esercizio3;

public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Giulio", "Rossi","lello@gmail.com", "01/01/1999");
    Articolo a = new Articolo("Macbook Pro", 1000, 2);
        Articolo b = new Articolo("Note pad", 100, 3);
        Articolo[] lista = {a, b};
    Carrello carrello = new Carrello(c,lista);

        System.out.println(c);
        System.out.println("Primo Articolo: " + a+", secondo articolo: "+b);
        System.out.println(carrello);
}
}
