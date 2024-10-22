public abstract class TaxiRequest<T> {
    protected T pickUpLocation;
    protected String destination;
    protected double distance;
    protected double estimatedPrice;

    public TaxiRequest(final T pickUpLocation, final String destination, final int distance) {
        this.createTaxiRequest(pickUpLocation, destination, distance);
    }

    public abstract void createTaxiRequest(final T pickUpLocation, final String destination, final int distance);

    public T getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(T pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getEstimatedPrice() {
        return estimatedPrice;
    }

    public void setEstimatedPrice(double estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }
}
