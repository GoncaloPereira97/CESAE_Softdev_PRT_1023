import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double peso = 100;

        ShippingCalculator calculatorOverNight = new ShippingCalculator(new OvernightShippingStrategy());
        ShippingCalculator calculatorStandard = new ShippingCalculator(new StandardShippingStrategy());
        ShippingCalculator calculatorExpress = new ShippingCalculator(new ExpressShippingStrategy());

        System.out.println("Overnight: " + calculatorOverNight.calculateShippingCost(peso));
        System.out.println("Standard: " + calculatorStandard.calculateShippingCost(peso));
        System.out.println("Express: " + calculatorExpress.calculateShippingCost(peso));
    }
}
