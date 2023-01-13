import java.util.Arrays;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k){
        if(k > strarr.length || k <= 0)
            return "";
        int longest = 0;
        String result = "";
        for (int i = 0; i < strarr.length - (k -1) ; i++) {
            String str = "";
            for (int j = 0; j < k; j++) {
                str += String.join("", strarr[i + j]);
            }
            if(longest < str.length()) {
                longest = str.length();
                result = str;
            }
        }
        return result;
    }
    public static String longestConsec2(String[] strarr, int k){
        String ans = "", test = "";
        if (k > 0){
            for (int i = 0; i < strarr.length +1 - k; i++) {
                test = String.join("", Arrays.copyOfRange(strarr, i, i+k));
                ans = ans.length() < test.length() ? test : ans;
            }

        }
        return ans;
    }
}
