import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner abc = new Scanner(System.in);

        System.out.print("A= ");
        int A = abc.nextInt();
        System.out.print("B= ");
        int B = abc.nextInt();

        int add = (A+B);
        int sub = (A-B);
        int multi = (A*B);
        int mod = (A%B);

        System.out.println("Addition = "+add);
        System.out.println("Subtraction = "+sub);
        System.out.println("Multiplication = "+multi);
        System.out.println("Modulus = "+mod);

        if (B == 0) {
            System.out.println("Invalid (cannot divide by zero)");
        } else {
            double div = (double) A / B;
            System.out.println("Division = " + div);
        }
    }
}
