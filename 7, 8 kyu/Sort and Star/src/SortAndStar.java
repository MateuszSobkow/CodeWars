import java.util.Arrays;

public class SortAndStar {
    public static String twoSor(String[] s){
        Arrays.sort(s);
        return String.join("***",s[0].split(""));
    }
}
