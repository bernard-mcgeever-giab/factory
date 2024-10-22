public class TaxiCreator {

    // Creates a default taxi request should little information be provided
    public static TaxiRequest<?> getTaxiRequest(final String pickUpLocation, final String destination, final int distance) {
        return new StandardTaxiRequest(pickUpLocation, destination, distance);
    }

    // Creates a food pick up request should a Restaurant order be the pick up location
    public static TaxiRequest<?> getTaxiRequest(final Restaurant pickUpLocation, final String destination, final int distance) {
        return new FoodDeliveryRequest(pickUpLocation, destination, distance);
    }

    // Creates taxi request based on the number of passengers
    public static TaxiRequest<?> getTaxiRequest(final int numOfPassengers, final String pickUpLocation, final String destination, final int distance) {
        if (numOfPassengers <= 0 || numOfPassengers >= 30) {
            throw new IllegalArgumentException("Unable to create TaxiRequest for " + numOfPassengers + " passengers");
        }

        switch (numOfPassengers) {
            case 1: case 2: case 3: case 4 :
                return new StandardTaxiRequest(pickUpLocation, destination, distance);
            case 5: case 6:
                return new SevenSeaterTaxiRequest(pickUpLocation, destination, distance);
            default:
                return new MiniBusTaxiRequest(pickUpLocation, destination, distance);
        }
    }

    // Creates taxi request based on TaxiType
    public static TaxiRequest<?> getTaxiRequest(final TaxiType taxiType, final String pickUpLocation, final String destination, final int distance) throws Exception {
        switch (taxiType) {
            case STANDARD_TAXI:
                return new StandardTaxiRequest(pickUpLocation, destination, distance);
            case SEVEN_SEATER:
                return new SevenSeaterTaxiRequest(pickUpLocation, destination, distance);
            case MINI_BUS:
                return new MiniBusTaxiRequest(pickUpLocation, destination, distance);
            default:
                throw new IllegalArgumentException("TaxiType " + taxiType + " not recognised");
        }
    }
}
