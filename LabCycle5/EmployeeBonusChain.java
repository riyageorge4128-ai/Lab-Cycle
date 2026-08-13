class Employee{
    protected final String companyName;
    protected double salary;
    Employee(String companyName, double salary){
        this.companyName = companyName;
        this.salary = salary;
    }

    double calculateBonus(){
        return 0.05 * salary;
    }
}

class Manager extends Employee{
    Manager(String companyName, double salary){
        super(companyName, salary);
    }

    @Override
    double calculateBonus(){
        return 0.1 * salary;
    }
}

class SeniorManager extends Manager{
    private double bonus = 5000;
    SeniorManager(String companyName, double salary){
        super(companyName,salary);
    }

    double calculateBonus(){
        return 0.15 * salary + bonus;
    }
}

public class EmployeeBonusChain {
    public static void main(String[] args){
        SeniorManager s = new SeniorManager("ABC Ltd", 80000);
        System.out.println("Company name: " + s.companyName);
        System.out.println("Bonus: " + s.calculateBonus());
    }
}
