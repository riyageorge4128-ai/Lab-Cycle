import java.util.Scanner;

public class ArrayMaximum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("N= ");
        int N = sc.nextInt();

        int a[] = new int[N];

        System.out.print("Enter array elements: ");

        for (int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }

        int max = a[0];

        for (int i=0; i<N; i++){
            if (a[i] > max)
                max = a[i];
        }
        System.out.print("Largest: "+max);
    }
}