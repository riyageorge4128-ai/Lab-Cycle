import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("A= ");
        int A = sc.nextInt();

        System.out.print("B= ");
        int B = sc.nextInt();

        int temp = A;
        A = B;
        B = temp;

        System.out.println("After Swap");
        System.out.println("A= "+A);
        System.out.println("B= "+temp);
    }
}
