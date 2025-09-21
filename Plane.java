package factory;

public class Plane implements Transport {
    @Override
    public void travel(String destination) {
        System.out.println("Flying to " + destination);
    }
}
