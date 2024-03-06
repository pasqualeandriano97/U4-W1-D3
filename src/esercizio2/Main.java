package esercizio2;

public class Main {
    public static void main(String[] args) {
        SimCard simCard = new SimCard(3569784321L,0.001);
        SingleCall firstCall=new SingleCall(0.3,3334455667L);
        SingleCall secondCall=new SingleCall(0.2,3335522667L);
        simCard.setCalls(new SingleCall[]{firstCall,secondCall});
        System.out.println(simCard);
    }
}
