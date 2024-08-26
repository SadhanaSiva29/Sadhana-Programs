package banking;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. SBI BANK\n2. AXIS BANK\n3. INDIAN BANK\nEnter the Bank Name:");
        String bankName = scanner.next();
        String cardNumber;
        int pin;
        double amount;
        switch (bankName.toLowerCase()) {
            case "sbibank":
                System.out.println("WELCOME TO SBI BANK\nEnter Card Number and pin");
                cardNumber = scanner.next();
                pin = scanner.nextInt();
                amount=scanner.nextDouble();
                SbiBank sbiBank = new SbiBank("SBI1234", 1234);
                System.out.println(sbiBank.withdraw(amount,cardNumber,pin));
                break;
            case "axisbank":
                System.out.println("WELCOME TO AXIS BANK");
                AxisBank axisBank = new AxisBank("AXIS1234", 1234);
                System.out.println("Enter Card Number and pin");
                cardNumber = scanner.next();
                pin = scanner.nextInt();
                System.out.println("Enter the withdrawal amount: ");
                amount=scanner.nextDouble();
                System.out.println(axisBank.withdraw(amount,cardNumber, pin));
                break;
            case "indianbank":
                System.out.println("\nWELCOME TO INDIAN BANK");
                IndianBank indianBank = new IndianBank("INDIAN1234", 1234);
                System.out.println("Enter Card Number and pin");
                cardNumber = scanner.next();
                pin = scanner.nextInt();
                amount=scanner.nextDouble();
                System.out.println(indianBank.withdraw(amount,cardNumber, pin));
                break;
            default:
                System.out.println("ENTER THE BANK NAME CORRECTLY");
        }

    }
}
