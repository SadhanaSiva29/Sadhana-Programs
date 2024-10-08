package inheritance;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String accountNumber,double balance, int year,double amount, double interestRate){
        super( accountNumber,balance);
        double interest= amount*year*interestRate/100;
        System.out.println("Interest: "+interest);
    }
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount("AB123",5000,2,500,10);
        System.out.println("Balance after depositing: "+savingsAccount.depositMoney(6000.00));
        System.out.println("Balance after Withdrawing: "+savingsAccount.withdrawMoney(12000));
    }
}
