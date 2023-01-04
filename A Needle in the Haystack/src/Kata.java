import java.util.Arrays;

public class Kata {
    public static String findNeedle (Object[] haystack){
        /*
        int i = 0;
        for (Object o:haystack) {
            if (o == "needle"){
                return "found the needle at position " + i;
            }
            i++;
        }
        return "needle not found";

         */

        return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
    }
}
