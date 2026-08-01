import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Number= ");
        int num = sc.nextInt();

        int sum = 0;

        for (; num > 0; num = num/10 ){
            sum = sum + (num%10);
        }
        System.out.print("Sum of digits= "+sum);
    }
}
