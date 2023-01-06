import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class Solution {
    static String removeExclamationMarks(String s)   {
        if(s == null || s.length() == 0)
            return s;
        String[] tabOfChars = s.split("");
        String str = "";
        for (String c:tabOfChars) {
            if (c.equals("!"))
                continue;
            else
                str += String.join("", c);
        }
        return str;
    }
    static String removeExclamationMarks2(String s)   {
        return s.replace("!", "");
    }

}
