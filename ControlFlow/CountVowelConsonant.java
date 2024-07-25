package ControlFlow;

public class CountVowelConsonant {
    public static void main(String[] args) {
        String[] str= new String[]{"apple","ball","collection","meeting"};
        int i;
        int j;
        for( i = 0;i<4;i++){
            int countvowel=0;
            for ( j=0;j<str[i].length();j++) {
                if (str[i].charAt(j) == 'a' || str[i].charAt(j) == 'e' || str[i].charAt(j) == 'i' || str[i].charAt(j) == 'o' || str[i].charAt(j) == 'u') {
                    countvowel++;
                }
            }
            System.out.println(str[i]+" has "+countvowel+" vowels.");
        }
    }
}
