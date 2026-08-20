import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Date of Joining (DD-MM-YYYY): ");
        String date = sc.nextLine();

        System.out.print("Enter Pass Number: ");
        int passNum = sc.nextInt();

        System.out.println("\n--- Employee Pass Details ---");
        System.out.println("Employee Name : " + empName);
        System.out.println("Joining Date  : " + date);
        System.out.println("Pass Number   : " + passNum);

        sc.close();
    }
}