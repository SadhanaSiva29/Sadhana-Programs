package regextask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateRegex {
    static String replaceDates(String text) {
        String dateRegex = "(\\d{2})/(\\d{2})/(\\d{4})";
        String replaceRegex = "$3-$2-$1";
        Pattern pattern = Pattern.compile(dateRegex);
        Matcher matcher = pattern.matcher(text);
        return matcher.replaceAll(replaceRegex);
    }
    public static void main(String[] args) {
        System.out.println(replaceDates("The event is scheduled for 12/09/2024 and another one for 25/12/2024"));
    }
}
