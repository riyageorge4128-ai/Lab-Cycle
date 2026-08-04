import java.util.Scanner;

public class ArraySorting{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = obj.nextInt();

        int a[] = new int[n];

        for (int i=0; i<n; i++){
            a[i] = obj.nextInt();
        }

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}