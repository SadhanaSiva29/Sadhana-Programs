package regextask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRegex {
    static boolean isValidPassword(String password) {
        String regex = "((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@,#,&,*])).{12}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        int[] count= new int[20];
        if(matcher.matches()){
            for(int i=0; i<password.length();i++) {
                for (int j = 0; j < password.length(); j++) {
                    if (password.charAt(i) == password.charAt(j)) {
                        count[i]++;
                    }
                }
            }
        }
        for(int i=0;i<password.length();i++){
            if(count[i]==1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("ABSaD@FE&*#N"));
    }
}
