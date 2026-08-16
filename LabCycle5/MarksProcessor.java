import java.util.Scanner;

public class MarksProcessor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];

        try{
            for (int i=0; i<5; i++){
                System.out.print("Mark "+(i+1)+ ": ");
                marks[i] = sc.nextInt();
            }
            int sum = 0;
            int count = 0;

            for (int mark:marks){
                sum += mark;
                count += 1;
            }
            double average = (double) sum / count;
            System.out.println("Average= " + average);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid");
        }
        catch(ArithmeticException e){
            System.out.println("Error");
        }
        finally{
            System.out.println("Processing complete");
        }
    }
}