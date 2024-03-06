import esercizio1.Rettangolo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la base del rettangolo: ");
        double base = sc.nextDouble();
        System.out.println("Inserisci l'altezza del rettangolo: ");
        double altezza = sc.nextDouble();
         Rettangolo r = new Rettangolo(base, altezza);
        System.out.println(r.toString());
        System.out.println("L'area del rettangolo è: " + r.areaRettangolo(r.getBase(), r.getAltezza()));
        System.out.println("Il perimetro del rettangolo è: " + r.perimetroRettangolo(r.getBase(), r.getAltezza()));
    }


}