import java.util.stream.Stream;
import java.util.*;

public class CodeWars {
    public static int strCount (String str, char letter){
        return (int) Stream.of(str.split("")).filter(x -> x.equals(String.valueOf(letter))).count();
    }
}
