package hr;

public class FullTimeEmployee extends Employee implements Taxable{
    private double salary;

    FullTimeEmployee(double salary){
        this.salary = salary;
    }
    @Override
    public double calculateSalary(){
        return salary;
    }

    @Override
    public double calculateTax(){
        return salary * 0.10;
    }
}
