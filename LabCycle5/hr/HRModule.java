package hr;
import hr.*;

public class HRModule {
    public static void main(String[] args){
        FullTimeEmployee e = new FullTimeEmployee(50000);
        System.out.println("Salary: " +e.calculateSalary());
        System.out.println("Tax: " +e.calculateTax());
    }
}
