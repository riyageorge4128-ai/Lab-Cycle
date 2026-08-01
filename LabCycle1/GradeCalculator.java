import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Marks = ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.print("Grade = A ");
        }
        else if (marks >= 80 && marks <= 89) {
            System.out.print("Grade = B ");
        }
        else if (marks >= 70 && marks <= 79) {
            System.out.print("Grade = C ");
        }
        else {
            System.out.print("Grade = D ");
        }
    }
}