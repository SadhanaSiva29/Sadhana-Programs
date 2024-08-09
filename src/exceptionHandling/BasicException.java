package exceptionHandling;

public class BasicException {
    public static void main(String[] args) {
        int dividend=20;
        try{
            System.out.println(dividend/0);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("End");
    }
}
