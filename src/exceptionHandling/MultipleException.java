package exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MultipleException {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        try {
            int dividend = scanner.nextInt();
            int divisor=scanner.nextInt();
            System.out.println(dividend/divisor);
        }
        catch(ArithmeticException e){
            System.err.println("Divide By Zero Exception");
        }
        catch (InputMismatchException m){
            System.err.println("Invalid Input");
        }
    }
}
