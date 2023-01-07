import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicateEncoder {
    static String encode (String word) {
        ArrayList<String> tabOfChars = new ArrayList<>(Arrays.asList(word.toLowerCase().split("")));
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < tabOfChars.size(); i++) {
            if (Collections.frequency(tabOfChars, tabOfChars.get(i)) > 1)
                str.append(")");
            else
                str.append("(");
        }
        return str.toString();
    }
    static String encode2 (String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
}
