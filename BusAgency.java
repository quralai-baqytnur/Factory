package factory;

public class BusAgency extends TravelAgency {
    @Override
    protected Transport createTransport() {
        return new Bus();
    }
}
