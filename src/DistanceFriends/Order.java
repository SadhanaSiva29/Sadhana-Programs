package DistanceFriends;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number1= scanner.nextInt();
        int number2= scanner.nextInt();
        int number3= scanner.nextInt();
        if(number1>number2 && number2>number3)
            System.out.println("Decreasing order");
        else if(number3>number2 && number2>number1)
            System.out.println("Increasing order");
        else
            System.out.println("Neither increasing nor decreasing");
    }
}
