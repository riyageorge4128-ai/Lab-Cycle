import java.util.Scanner;
class Square {
    int Sqr(int num) {
        return num * num;
    }
}
public class Main {
    public static void main(String[] args) {
        Square obj = new Square();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int answer = obj.Sqr(num);
        System.out.println("Square = " + answer);
    }
}