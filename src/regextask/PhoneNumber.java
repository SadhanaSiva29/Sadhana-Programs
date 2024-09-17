package regextask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public  String extractPhoneNumbers(String text) {
        String phoneRegex = "\\(\\+\\d{2}\\)\\s\\d{5}-\\d{5} | \\d{3}-\\d{3}-\\d{4}";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(text);
        String result = "";
        while (matcher.find()) {
            result = result + matcher.group() + " or ";
        }
        if (result != "")
            return result;
        else
            return "null";
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        System.out.println(phoneNumber.extractPhoneNumbers("Call me at (+91) 23456-72890 or at 987-424-4124"));
        System.out.println(phoneNumber.extractPhoneNumbers("No phone number here!"));
    }
}
