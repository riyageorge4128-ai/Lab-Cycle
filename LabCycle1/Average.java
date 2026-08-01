import java.util.Scanner;

public class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        Double num1 = sc.nextDouble();

        System.out.print("Enter num2: ");
        Double num2 = sc.nextDouble();

        System.out.print("Enter num3: ");
        Double num3 = sc.nextDouble();

        Double avg = (num1 + num2 + num3)/3;
        System.out.print("Average: "+avg);
    }
}