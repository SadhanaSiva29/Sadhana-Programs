package ControlFlow;


//prime numbers bw 1-484
public class PrimeNumCheck {
    public static void main(String[] args) {
        int num = 484;
        int i;

        for (i = 2; i < num; i++) {
            int countFact=0;
            for (int j = 2; j <=i; j++) {
                if (i % j == 0) {
                    countFact++;
                }
            }
            if (countFact<2) {
                System.out.println(i);
            }
        }
    }
}
