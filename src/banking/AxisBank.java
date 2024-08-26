package banking;

import java.util.Date;

public class AxisBank extends Visa {
    double balance = 4000;

    AxisBank(String cardNumber, int pin) {
        super(cardNumber, pin);
        super.balance=this.balance;
    }

    @Override
    boolean authenticate(String cardNumber, int pin) {
        return this.cardNumber.equals(cardNumber) && this.pin == pin;
    }

    @Override
    double getBalance() {
        return balance;
    }
}