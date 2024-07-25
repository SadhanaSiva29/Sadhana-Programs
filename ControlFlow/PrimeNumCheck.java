package ControlFlow;

public class PrimeNumCheck {
    public static void main(String[] args) {
        int num=484;
        int i;
        int countFact=0;
        for(i=2;i<num;i++){
            if(num%i==0){
                countFact++;
            }
        }
        if(countFact==0){
            System.out.println("The entered number is a prime number.");
        }
        else{
            System.out.println("The entered number is a Composite number.");
        }
    }
}
