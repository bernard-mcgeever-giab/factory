public enum Restaurant {
    MCDONALD(5.30),
    KFC(4.99),
    BURGER_KING(8.20),
    DOMINOS(10.99);

    private final double price;

    Restaurant(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}