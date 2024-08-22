package exceptionHandling;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        super("Invalid");
    }
    public static boolean checkAge(int age) {
       return age > 0 && age < 120;
    }
        public static void main(String[] args) {
        try {
            if(!checkAge(1200))
                throw new InvalidAgeException();
            }
        catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
