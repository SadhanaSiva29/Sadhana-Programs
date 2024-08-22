package ControlFlow;

public class PalindromeCheck {
    public static void main(String[] args) {
        String[] str = new String[]{"racecar", "man", "madam", "question"};
        String strrev;
        char ch;
        int i;
        int j;
        for (i = 0; i < 4; i++) {
            strrev = "";
            for (j = 0; j < str[i].length(); j++) {
                ch = str[i].charAt(j);
                strrev = ch + strrev;
            }
            if (str[i].equals(strrev)) {
                System.out.println(str[i] + " is a palindrome");
            }
        }
    }

