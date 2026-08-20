import java.util.Scanner;

public class UnitPriceCalculator {
    public static void main(String[] args) {
        int weight;
        double pricePerKg;
        double totalPrice;

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Weight in grams: ");
        weight = s.nextInt();

        System.out.print("Enter Price per KG: ");
        pricePerKg = s.nextDouble();

        if (weight <= 0 || pricePerKg <= 0) {
            System.out.println("Invalid input: Weight and price must be positive numbers.");
        } else {
            // Convert grams to kg and compute total price
            double weightInKg = weight / 1000.0;
            totalPrice = weightInKg * pricePerKg;

            System.out.println("--------------------------------");
            System.out.println("Weight (kg)   : " + weightInKg);
            System.out.println("Price per kg  : " + pricePerKg);
            System.out.println("Total Price   : " + String.format("%.2f", totalPrice));
            System.out.println("--------------------------------");
        }

        s.close();
    }
}
