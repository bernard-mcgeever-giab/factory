public class StandardTaxiRequest extends TaxiRequest<String> {
    private static final double FARE_MULTIPLIER = 1.5;

    public StandardTaxiRequest(final String pickUpLocation, final String destination, final int distance) {
        super(pickUpLocation, destination, distance);
    }

    @Override
    public void createTaxiRequest(final String pickUpLocation, final String destination, final int distance) {
        this.pickUpLocation = pickUpLocation;
        this.destination = destination;
        this.distance = distance;
        this.estimatedPrice = distance * FARE_MULTIPLIER;
        System.out.println("A taxi is on its way. The estimated fare is £" + estimatedPrice + ".");
    }
}
