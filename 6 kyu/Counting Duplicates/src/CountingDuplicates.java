import java.util.*;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        if(text == null || text.length() == 0 || text.toLowerCase().chars().distinct().count() == 0)
            return 0;
        Set<String> setOfDuplicatedLetters = new HashSet<>();
        for (String i : text.toLowerCase().split("")) {
            if(text.toLowerCase().indexOf(i) != text.toLowerCase().lastIndexOf(i))
                setOfDuplicatedLetters.add(i);
        }
        System.out.println(setOfDuplicatedLetters);
        return setOfDuplicatedLetters.size();
    }
    public static int duplicateCount2(String text) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : text.toLowerCase().toCharArray()) {
                map.put(c, map.containsKey(c) ? 1 : 0);
            }
            return (int) map.values().stream().filter(e -> e > 0).count();
        }
    }


