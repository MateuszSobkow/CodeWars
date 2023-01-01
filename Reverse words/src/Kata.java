import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata
{
    public static String reverseWords(final String original)
    {
//        String[] array = original.split(" ");
//
//        if(array.length == 0)
//            return original;
//
//
//        int i = 0;
//        for(String string : array){
//            array[i] = new StringBuilder(string).reverse().toString();
//            i++;
//        }
//
//        return String.join(" ",array);
        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining());
    }
}