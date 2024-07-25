package ControlFlow;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=12345;
        int reverse=0;
        int reminder;
        System.out.println("Number: "+num);
        while(num>0){
            reminder=num%10;
            reverse=reminder+reverse*10;
            num=num/10;
        }
        System.out.println("Reversed number:"+reverse);
    }
}
