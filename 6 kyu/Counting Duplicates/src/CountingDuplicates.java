import java.util.*;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        if(text == null || text.length() == 0 || text.toLowerCase().chars().distinct().count() == 0)
            return 0;
        Set<String> setOfDuplicatedLetters = new HashSet<>();
        char[] tabOfLetters =text.toLowerCase().toCharArray()
        Arrays.sort(tabOfLetters);
        Arrays.stream(new char[][]{tabOfLetters}).filter(x -> x == x );
        Arrays.stream(Arrays.stream(Collections.sort(Arrays.asList(text.split()))).filter(x -> )

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcde"));
    }
}
