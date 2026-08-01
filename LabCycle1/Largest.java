import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A= ");
        int A = sc.nextInt();

        System.out.print("B= ");
        int B = sc.nextInt();

        System.out.print("C= ");
        int C = sc.nextInt();

        if (A >= B && A >= C) {
            System.out.print("Largest = " + A);
        } else if (B >= A && B >= C) {
            System.out.print("Largest = " + B);
        } else {
            System.out.print("Largest = " + C);
        }
    }
}
