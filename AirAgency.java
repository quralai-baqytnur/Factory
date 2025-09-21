package factory;

public class AirAgency extends TravelAgency {
    @Override
    protected Transport createTransport() {
        return new Plane();
    }
}
