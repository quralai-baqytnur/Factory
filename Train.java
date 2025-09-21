package factory;

public class Train implements Transport {
    @Override
    public void travel(String destination) {
        System.out.println("Going to " + destination + " by train");
    }
}
