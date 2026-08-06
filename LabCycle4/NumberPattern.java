import java.util.Scanner;

public class NumberPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int N = sc.nextInt();

        System.out.print("Numbers : ");
        for (int i=1; i<=N; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        int sum = 0;
        for (int i=1; i<=N; i++){
            if (i%2 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of Even Numbers : "+sum);

        int count = 0;
        for (int i=1; i<=N; i++){
            if (i%2 != 0){
                count ++;
            }
        }
        System.out.println("Odd Count : "+count);

        int largest = 0;
        for (int i=0; i<=N; i++){
            if (i%5 == 0){
                largest = i;
            }
        }
        System.out.println("Largest Multiple of 5 : "+largest);
    }
}