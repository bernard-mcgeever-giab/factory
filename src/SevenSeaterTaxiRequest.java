public class SevenSeaterTaxiRequest extends TaxiRequest<String> {
    private static final double FARE_MULTIPLIER = 2;

    public SevenSeaterTaxiRequest(String pickUpLocation, String destination, int distance) {
        super(pickUpLocation, destination, distance);
    }

    @Override
    public void createTaxiRequest(String pickUpLocation, String destination, int distance) {
        this.pickUpLocation = pickUpLocation;
        this.destination = destination;
        this.distance = distance;
        this.estimatedPrice = distance * FARE_MULTIPLIER;
        System.out.println("A large taxi is on its way. The estimated fare is £" + estimatedPrice + ".");
    }
}
