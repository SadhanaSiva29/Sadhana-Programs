package exceptionHandling;

import java.util.Scanner;

public class IllegalArgumentException extends Exception {
    public IllegalArgumentException(String str) {
        super(str);
    }
}
class test2{
    public static void calculateSquareroot(double number) throws IllegalArgumentException{
        if(number<=0){
            throw new IllegalArgumentException("Invalid number");
        }
        else{
            System.out.println("Squareroot:"+Math.sqrt(number));
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double num;
        try{
            num= sc.nextDouble();
            calculateSquareroot(num);
        }
        catch (IllegalArgumentException e){
            System.out.println("Age is not acceptable.\n"+e);
        }
    }
}
