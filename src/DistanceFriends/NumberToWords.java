package DistanceFriends;

import java.util.Scanner;

public class NumberToWords {
    public static void numberToWords(int number) {
        String[] one = {"", "one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (number / 100000 != 0)
            System.out.print(one[(number / 100000) % 100] + " lakh ");
        if (number > 100000)
            number = number % 100000;
        if (number / 1000 != 0 && (number / 1000) % 100 <= 19 && number % 1000 != 0)
            System.out.print(one[(number / 1000) % 100] + " thousand ");
        if (number / 1000 != 0 && (number / 1000) % 100 > 19)
            System.out.print(tens[(number / 10000)] + " " + one[(number / 1000) % 10] + " thousand ");
        if (number / 100 != 0 && (number / 100) % 10 != 0)
            System.out.print(one[(number / 100) % 10] + " hundred ");
        if (number % 100 > 19)
            System.out.print(tens[((number % 100) / 10)] + " " + one[number % 10]);
        if (number % 100 <= 19)
            System.out.print(one[number % 100] + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value:");
        int numberInput = scanner.nextInt();
        if (numberInput > 0 && numberInput <= 200000) {
            numberToWords(numberInput);
        } else
            System.out.println("Invalid input");
    }
}
