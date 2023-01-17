import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MexicanWave {

    public static String[] wave(String str){
        if(str == null || str.length() == 0)
            return new String[0];
        int stringLength = str.replace("\\s", "").length();
        List<String> listOfStringOfMexicanWave = new ArrayList<>();



        for (int i = 0; i < stringLength; i++) {
            if(str.charAt(i) == ' ') {
                continue;
            }
           StringBuilder sb = new StringBuilder(str);

            sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            listOfStringOfMexicanWave.add(sb.toString());
        }
        return listOfStringOfMexicanWave.toArray(new String[0]);
    }
    public static String[] wave2(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            list.add(str.substring(0,i) + Character.toUpperCase(ch) + str.substring(i+1));
        }
        return list.toArray(new String[0]);
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave("two words")));
    }
}
