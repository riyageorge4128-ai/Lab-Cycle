import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("A= ");
        int a = sc.nextInt();

        System.out.print("B= ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Not possible.");
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}