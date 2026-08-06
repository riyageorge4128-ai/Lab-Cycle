import java.util.Scanner;

public class PasswordValidator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Password: ");
        int pwd = sc.nextInt();

        int count = 0;
        int temp = pwd;

        while (temp>0){
            count ++;
            temp = temp / 10;
        }

        if (count != 6){
            System.out.println("Invalid Access Code");
            sc.close();
            return;
        }

        int[] digits = new int[6];
        temp = pwd;

        for (int i=0; i<6; i++){
            digits[i] = (int) (temp%10);
            temp = temp/10;
        }

        int evenCount = 0;
        int oddCount = 0;
        int sum= 0;

        for (int i=0; i<6; i++){
            sum = sum + digits[i];

            if (digits[i]%2 == 0){
                evenCount ++ ;
            }
            else{
                oddCount ++ ;
            }
        }

        if (evenCount>0 && oddCount>0 && sum>20){
            System.out.println("Valid Access Control");
        }
        else{
            System.out.println("Invalid Access Control");
        }
    }
}