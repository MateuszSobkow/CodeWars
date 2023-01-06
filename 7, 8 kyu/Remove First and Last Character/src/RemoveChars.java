import java.util.ArrayList;
import java.util.Arrays;

public class RemoveChars {
    /* public static String remove(String str) {

         char[] c = new char[str.length()-2];
         str.getChars(1, str.length()-1, c, 0 );
         String result = new String(c);
         return result;
     } */
    public static String remove(String str) {

        return str.substring(1, str.length()-1);
    }



    public static void main(String[] args) {
        System.out.println(remove("eloquent"));
    }
}
