package factory;

public abstract class TravelAgency {
    protected abstract Transport createTransport();

    public void organizeTrip(String destination) {
        Transport transport = createTransport();
        transport.travel(destination);
    }
}
