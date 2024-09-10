package regextask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    public boolean isValidEmail(String email){
        String regex = "^[^@]+@[^@]+\\.[^@\\.]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmailRegex emailRegex = new EmailRegex();
        String email = scanner.next();
        System.out.println(emailRegex.isValidEmail(email));
    }
}
