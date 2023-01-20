import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static String camelCase(String input){
        if(input == null || input.length() == 0)
            return input;
        StringBuilder sb = new StringBuilder();
        List<String> listOfWords = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if ((Character.isUpperCase(input.charAt(i)))){
                listOfWords.add(sb.toString());
                sb = new StringBuilder();
            } else if (i == input.length() - 1) {
                sb.append(input.charAt(i));
                listOfWords.add(sb.toString());
            }
            sb.append(input.charAt(i));
        }
       return String.join(" ", listOfWords);
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
    }
}
