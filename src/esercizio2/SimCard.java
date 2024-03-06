package esercizio2;


import java.util.Arrays;

public class SimCard {


    private float simNumber;
    private double simCredit;
    private SingleCall[] calls ;

    public SimCard(float simNumber, double simCredit) {
        this.simNumber = simNumber;        this.simCredit = simCredit;
        this.calls = new SingleCall[2];
    }

    public void setCalls(SingleCall[] calls) {
        this.calls = calls;
    }

    @Override
    public String toString() {
        return "SimCard{" +
                "simNumber=" + simNumber +
                ", simCredit=" + simCredit +
                ", calls=" + Arrays.toString(calls) +
                '}';
    }
}
