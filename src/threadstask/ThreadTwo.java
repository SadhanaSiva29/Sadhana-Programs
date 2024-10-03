package threadstask;

public class ThreadTwo implements Runnable {
    public int start;
    public int end;
    ThreadTwo(int start, int end){
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() {
        for ( int i = start; i <= end; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Runnable print1 = new ThreadTwo(1,5);
        Runnable print2 =  new ThreadTwo(6,10);

        Thread thread1 = new Thread(print1);
        Thread thread2 = new Thread(print2);

        thread1.start();
        thread2.start();
    }
}
