package threadstask;

public class ThreadThree extends Thread{
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1050);
                System.out.println(i);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
