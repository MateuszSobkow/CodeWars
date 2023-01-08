import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Kata {
    public static String high(String s){
        String[] words = s.split(" ");
        HashMap<Integer, String> mapOfWords = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            int key = 0;
            for (char c :words[i].toCharArray()) {
                key +=  (int)c - 96;
            }
            if(mapOfWords.get(key) == null)
                mapOfWords.put(key, words[i]);
        }
        return mapOfWords.get(Collections.max(mapOfWords.keySet()));
    }
    public static String high2(String s){
        return Arrays.stream(s.split(" "))
                .max(Comparator.comparingInt(a ->
                        a.chars().map(i -> i-96).sum()))
                .get();
    }
}


