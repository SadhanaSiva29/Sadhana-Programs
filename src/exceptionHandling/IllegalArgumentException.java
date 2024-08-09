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
        double num;
        try{
            num= sc.nextDouble();
            if(calculateSquareroot(num)) {
                throw new IllegalArgumentException();
            }
            else{
                System.out.println(Math.sqrt(num));
            }
        }
        catch (IllegalArgumentException e){
            System.err.println(e);
        }
    }
}
