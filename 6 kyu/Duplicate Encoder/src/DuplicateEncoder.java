import java.util.Arrays;

public class DuplicateEncoder {
    static String encode (String word){
        String str = "";
        for (char c :word.toCharArray()) {
            if (word.indexOf(c) == word.indexOf(c))
                continue;
            if (word.matches(String.valueOf(c)))
                str += String.join("", word.replace(c, ')'));
            else
                str += String.join("", word.replace(c, '('));

        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(encode("asd"));
    }
}
