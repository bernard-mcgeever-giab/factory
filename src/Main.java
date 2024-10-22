//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("Standard taxi (default) - ");
        TaxiCreator.getTaxiRequest("1 Charming Av", "49 GoodFeeling Ln", 5);

        System.out.print("Food Delivery (Restaurant) - ");
        TaxiCreator.getTaxiRequest(Restaurant.MCDONALD,"49 GoodFeeling Ln", 5);

        System.out.print("Seven seater (passengers) - ");
        TaxiCreator.getTaxiRequest(6, "1 Charming Av", "49 GoodFeeling Ln", 5);

        System.out.print("Mini bus (TaxiType) - ");
        TaxiCreator.getTaxiRequest(TaxiType.MINI_BUS, "1 Charming Av", "49 GoodFeeling Ln", 5);

        System.out.print("Error - ");
        TaxiCreator.getTaxiRequest(345, "1 Charming Av", "49 GoodFeeling Ln", 5);
    }
}