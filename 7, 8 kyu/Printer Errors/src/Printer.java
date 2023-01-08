import java.util.Arrays;
import java.util.stream.Stream;

public class Printer {
    public static String printerError (String s){
        if (s == null || s.length() == 0)
            return s;
        int numberOfErrors = 0;
        for (char c :s.toCharArray()) {
            if ((int) c > 109 && (int) c <123)
                numberOfErrors++;
        }
        return String.format("%d/%d", numberOfErrors, s.length());
    }
    public static String printerError2 (String s){
        return s.replace("[a-m]", "").length() + "/" + s.length();
    }
    public static String printerError3 (String s){
        return String.format("%d/%d", s.chars().filter(x -> x > 'm').count(), s.length());

    }

    public static void main(String[] args) {
        System.out.println(printerError("zzz"));
    }
}
