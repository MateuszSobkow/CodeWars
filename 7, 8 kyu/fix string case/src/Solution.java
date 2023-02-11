public class Solution {
    public static String solve(final String str){
        int numberOfLowercaseLetters = 0;
        int numberOfUppercaseLetters = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)))
                numberOfUppercaseLetters++;
            else if(Character.isLowerCase(str.charAt(i)))
                numberOfLowercaseLetters++;

        }
        return numberOfLowercaseLetters >= numberOfUppercaseLetters ? str.toLowerCase() : str.toUpperCase();
    }
}
