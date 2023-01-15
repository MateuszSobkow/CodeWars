import java.util.Arrays;

public class SmashWords {

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        StringBuilder str = new StringBuilder();
        for (String s :words) {
            str.append(s).append(" ");
        }
        return str.toString().trim();
    }
}