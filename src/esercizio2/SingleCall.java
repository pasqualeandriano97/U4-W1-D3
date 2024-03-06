package esercizio2;

public class SingleCall {
    private double time;
    private long number;

    public SingleCall(double time, long number) {
        this.time = time;        this.number = number;
    }

    @Override
    public String toString() {
        return "SingleCall{" +
                "time=" + time +
                ", number=" + number +
                '}';
    }
}
