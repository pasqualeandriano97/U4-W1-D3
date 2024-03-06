import esercizio1.Rettangolo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci la base del primo rettangolo: ");
        double base = sc.nextDouble();
        System.out.println("Inserisci l'altezza del primo rettangolo: ");
        double altezza = sc.nextDouble();
         Rettangolo r = new Rettangolo(base, altezza);
        System.out.println(r.toString());
        System.out.println("Inserisci la base del secondo rettangolo: ");
        double base1 = sc.nextDouble();
        System.out.println("Inserisci l'altezza del secondo rettangolo: ");
        double altezza1 = sc.nextDouble();
        Rettangolo r1 = new Rettangolo(base, altezza);
        System.out.println(r.toString());
        System.out.println("L'area del primo rettangolo è: " + r.areaRettangolo(r.getBase(), r.getAltezza()));
        System.out.println("Il perimetro del primo rettangolo è: " + r.perimetroRettangolo(r.getBase(), r.getAltezza()));
        System.out.println("L'area del secondo rettangolo è: " + r1.areaRettangolo(r1.getBase(), r1.getAltezza()));
        System.out.println("Il perimetro del secondo rettangolo è: " + r1.perimetroRettangolo(r1.getBase(), r1.getAltezza()));
        System.out.println("La somma dei perimetri dei due rettangoli è: "+(r.perimetroRettangolo(r.getBase(), r.getAltezza())+r1.perimetroRettangolo(r1.getBase(), r1.getAltezza())));
        System.out.println("La somma delle aree dei due rettangoli è: "+(r.areaRettangolo(r.getBase(), r.getAltezza())+r1.areaRettangolo(r1.getBase(), r1.getAltezza())));
    }


}