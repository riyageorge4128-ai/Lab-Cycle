import java.util.Scanner;

public class NumPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("N= ");
        int N = sc.nextInt();

        for (int i=1; i<=N; i++){
            System.out.println(i+" ");
        }

        int sum = 0;
        for (int i=1; i<=N; i++){
            if (i%2 == 0)
                sum = sum + i;
        }
        System.out.println("Sum of even numbers: "+sum);


        int count = 0;
        for (int i=1; i<=N; i++){
            if (i%2 != 0)
                count ++;
        }
        System.out.println("Odd count: "+count);

        int largest = 0;
        for (int i=1; i<=N; i++){
            if (i%5 == 0)
                largest = i;
        }
        System.out.print("Largest: "+largest);
    }
}