package banking;

import java.util.Date;

public abstract class Visa {
    //protected String cardName="Sadhana";
    protected int pin;
    protected String cardNumber;
    protected double balance;

    Visa(String cardNumber,int pin){
        this.cardNumber=cardNumber;
        this.pin=pin;
    }

    abstract boolean authenticate(String cardNumber, int pin);

    abstract double getBalance();

    public double withdraw(double amount, String cardNumber, int pin) {
        if(authenticate(cardNumber, pin)) {
            if (getBalance() < amount) {
                System.out.println("Insufficient balance in your account." +
                        "\nBalance available is rs "+ balance);
                return 0;
            } else {
                balance -= amount;
                System.out.println("Balance:" + balance + "\nWithdrawal amount: ");
                return amount;
            }
        }
        else {
            System.out.println("Invalid user name or pin.");
            return 0;
        }
    }

}
