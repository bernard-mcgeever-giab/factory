public class FoodDeliveryRequest extends TaxiRequest<Restaurant> {

    private static final double FARE_MULTIPLIER = 0.7;

    private double foodBill;

    public FoodDeliveryRequest(Restaurant pickUpLocation, String destination, int distance) {
        super(pickUpLocation, destination, distance);
    }

    @Override
    public void createTaxiRequest(Restaurant pickUpLocation, String destination, int distance) {
        this.pickUpLocation = pickUpLocation;
        this.destination = destination;
        this.distance = distance;
        this.foodBill = pickUpLocation.getPrice();
        this.estimatedPrice = distance * FARE_MULTIPLIER + this.foodBill;

        System.out.println("Your food from "
                + this.pickUpLocation.toString().toLowerCase()
                + " is on its way! The total bill (including delivery) is £"
                + this.estimatedPrice
                + ".");
    }
}