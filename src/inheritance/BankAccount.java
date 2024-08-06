package inheritance;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public double depositMoney(double amount){
        balance= balance+amount;
        return balance;
    }
    public double withdrawMoney(double amount){
        if(balance>amount) {
            balance = balance - amount;
            return balance;
        }
        else
            return 0;
    }
}
