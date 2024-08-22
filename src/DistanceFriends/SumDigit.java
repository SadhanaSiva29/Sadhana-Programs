package DistanceFriends;

import java.util.Scanner;

public class SumDigit {
    public int sumFirstAndLastDigit(int number) {
        int temporary = number;

        if (number > 0) {
            while (number > 10) {
                number = number / 10;
            }
            int lastDigit = temporary % 10;
            return number + lastDigit;
        } else
            return -1;
    }

    public static void main(String[] args) {
        SumDigit sumDigit = new SumDigit();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        System.out.println("Sum of first and last digit of the number is "
                + sumDigit.sumFirstAndLastDigit(number));
    }
}
