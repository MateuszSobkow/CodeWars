import java.util.*;
public class Order {
    public static String order(String words){
        if(words == null || words.length() == 0)
            return words;

        String[] tabOfStringWords = words.split(" ");
        StringJoiner joiner = new StringJoiner(" ");

        for (int i = 1; i < tabOfStringWords.length + 1; i++) {
            for (String word : tabOfStringWords) {
                if (word.contains("" + i))
                   joiner.add(word);
            }
        }
        return String.valueOf(joiner);
    }
        public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }

}
