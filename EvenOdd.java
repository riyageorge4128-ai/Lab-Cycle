import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number = ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.print(num+ "is Even");
        }
        else{
            System.out.print(num+ "is Odd");
        }
    }
}
