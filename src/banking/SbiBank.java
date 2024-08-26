package banking;

public class SbiBank extends Visa {
    double balance = 1000;

    public SbiBank(String cardNumber,int pin) {
        super(cardNumber,pin);
        super.balance=this.balance;

    }

    @Override
    public boolean authenticate(String cardNumber, int pin) {
        return this.cardNumber.equals(cardNumber) && this.pin == pin;
    }

    @Override
    double getBalance() {
        return balance;
    }
}