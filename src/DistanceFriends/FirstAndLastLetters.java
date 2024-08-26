package DistanceFriends;

import java.util.Scanner;

public class FirstAndLastLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordArray = {"apple", "application", "banana", "appreciate", "pineapple", "appon"};
        System.out.println("Enter first letters and last letters:");
        String firstLetters = scanner.next();
        String lastLetters = scanner.next();
        if (lastLetters.length() == 2 && firstLetters.length() == 2) {
            for (int i = 0; i < wordArray.length; i++)
                if (wordArray[i].endsWith(lastLetters) && wordArray[i].startsWith(firstLetters))
                    System.out.println(wordArray[i]);
        }
        else{
            System.out.println("Enter only two first and last letters");
        }
    }
}
