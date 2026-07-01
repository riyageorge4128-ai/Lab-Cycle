import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        System.out.print("Basic Salary: ");
        int salary = obj.nextInt();

        if (salary >0){
            Double DA = (salary * 0.10);
            Double HRA = (salary * 0.15);
            Double gross = (salary + DA + HRA);

            System.out.println("DA: "+DA);
            System.out.println("HRA: "+HRA);
            System.out.println("Gross Salary: "+gross);
        }
       else{
           System.out.print("Invalid");
        }
    }
}
