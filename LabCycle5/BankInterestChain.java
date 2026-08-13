class Account{
    protected double balance;
    protected final double Min_Balance = 1000.0;

    Account(double balance){
        this.balance  = balance;
    }

    double calculateInterest(){
        return balance * 0.04;
    }
}

class SavingsAccount extends Account{
    SavingsAccount(double balance){
        super(balance);
    }

    @Override
    double calculateInterest(){
        return balance * 0.06;
    }
}

class FixedDepositAccount extends SavingsAccount{
    FixedDepositAccount(double balance){
        super(balance);
    }

    @Override
    double calculateInterest(){
        return super.calculateInterest() + 1000;
    }
}

public class BankInterestChain {
    public static void main(String[] args){
        FixedDepositAccount fd = new FixedDepositAccount(50000);
        System.out.println("Minimum balance: "+ fd.Min_Balance);
        System.out.println("Interest: "+ fd.calculateInterest());
    }
}
