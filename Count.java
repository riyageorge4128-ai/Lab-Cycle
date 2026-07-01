import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Size: ");
        int n = obj.nextInt();

        int[] arr = new int[n];

        System.out.println("Array: ");

        for(int i = 0; i<n; i++){
            arr[i] = obj.nextInt();
        }

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i : arr){
            if (i == 0){
                zero ++;
            }
            else if (i<0){
                negative ++;
            }
            else{
                positive ++;
            }
        }
        System.out.println("Positive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
        System.out.println("Zeros: "+zero);
    }
}
