
public class Kata {
    public static String reverseLetter(final String str){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i)))
                sb.insert(0, str.charAt(i));
        }
        return sb.toString();

    }
}
