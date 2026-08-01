import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("Array: ");

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];

        for (int i = 1; i<N; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("Largest element: "+max);

    }
}
