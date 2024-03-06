package esercizio1;

public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;        this.altezza = altezza;
    }
    public static double perimetroRettangolo(double base, double altezza) {
        return 2*(base+altezza);
    }
    public static double areaRettangolo(double base,double altezza) {
        return base*altezza;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }



    @Override
    public String toString() {
        return "Rettangolo{" +
                "lato=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
