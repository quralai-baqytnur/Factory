package factory;

public class Bus implements Transport {
    @Override
    public void travel(String destination) {
        System.out.println("Traveling to " + destination + " by bus");
    }
}
