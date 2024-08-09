package exceptionHandling;

import java.util.Scanner;

public class IllegalArgumentException extends Exception {
    public IllegalArgumentException() {
        super("The number entered is invalid.");
    }
    public static boolean calculateSquareroot(double number){
        return number<=0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double number;
        try{
            number= sc.nextDouble();
            if(calculateSquareroot(number)) {
                throw new IllegalArgumentException();
            }
            else{
                System.out.println(Math.sqrt(number));
            }
        }
        catch (IllegalArgumentException e){
            System.err.println(e);
        }
    }
}
