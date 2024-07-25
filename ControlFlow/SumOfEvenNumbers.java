package ControlFlow;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=25;i++){
            if(i%2==0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of all Even numbers from 1 to 25 is: "+sum);
    }
}
