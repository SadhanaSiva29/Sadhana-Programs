package DistanceFriends;

public class NumberSeriesFivePass {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println("PASS");
            } else
                System.out.println(i);
        }
    }
}
