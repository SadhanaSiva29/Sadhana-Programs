package ControlFlow;

public class Grade {
    public static void main(String[] args) {
        int mark=450;
        if (mark<=500 && mark>400){
            System.out.println("Grade A");
        }
        else if (mark<=400 && mark>350) {
            System.out.println("Grade B");
        }
        else if (mark<=350 && mark>300) {
            System.out.println("Grade C");
        }
        else if (mark<=300 && mark>250) {
            System.out.println("Grade D");
        }
        else if (mark<=250 && mark>200) {
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail");
        }
    }
}
