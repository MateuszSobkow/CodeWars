import java.util.ArrayList;
import java.util.Arrays;

public class Kata {
    public static int[] digitize(long n){
//        StringBuilder str = new StringBuilder(String.valueOf(n)).reverse();
//        int[] tab = new int[str.length()];
//        for (int i = 0; i < tab.length; i++) {
//            tab[i] = str.charAt(i) - 48 ;
//        }
//        return tab;

        return new StringBuilder().append(n)
                                    .reverse()
                                    .chars()
                                    .map(Character::getNumericValue)
                                    .toArray();
    }

    public static void main(String[] args) {
        System.out.println((Arrays.toString(digitize(35231))));
    }
}
