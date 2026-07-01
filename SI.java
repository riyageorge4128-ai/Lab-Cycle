import java.util.Scanner;

public class SI {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = sc.nextInt();

        System.out.print("Rate: ");
        int rate = sc.nextInt();

        System.out.print("Time: ");
        int time = sc.nextInt();

        int SI = 0;

        if (principal > 0 && rate > 0 && time > 0){
             SI = (principal * rate * time)/100;
            System.out.println("Simple Interest = "+SI);

            int amount = (principal + SI);
            System.out.println("Amount = "+amount);
        }
        else{
            System.out.print("Invalid");
        }
    }
}