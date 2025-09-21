package factory;

public class RailAgency extends TravelAgency {
    @Override
    protected Transport createTransport() {
        return new Train();
    }
}
