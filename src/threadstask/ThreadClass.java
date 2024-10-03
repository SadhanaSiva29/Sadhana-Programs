package threadstask;

public class ThreadClass extends Thread{
    public int number;
    ThreadClass(int number){
        this.number = number;
    }
    public void run()
    {
        System.out.print("Welcome to Thread - ");
    }
    public static void main(String[] args)
    {

        for(int i = 0; i < 5; i++) {
            ThreadClass threadClass = new ThreadClass(i);
            threadClass.start();
            System.out.print(i+"\n");
        }
    }
}
