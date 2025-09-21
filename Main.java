package factory;

public class Main {
    public static void main(String[] args) {
        TravelAgency air = new AirAgency();
        air.organizeTrip("Paris");

        TravelAgency rail = new RailAgency();
        rail.organizeTrip("Berlin");

        TravelAgency bus = new BusAgency();
        bus.organizeTrip("Astana");
    }
}
