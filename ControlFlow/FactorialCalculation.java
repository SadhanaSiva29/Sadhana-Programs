package ControlFlow;

public class FactorialCalculation {
    public static void main(String[] args) {
        int fact=1;
        int i;
        int num=4;
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of 4: "+fact);
    }
}
