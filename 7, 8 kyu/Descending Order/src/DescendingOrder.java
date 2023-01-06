import java.util.*;

import static java.lang.String.valueOf;

public class DescendingOrder {
    public static int sortDesc(final int num){
        ArrayList<String> arrayList = new ArrayList<>(List.of(valueOf(num).split("")));
        Collections.sort(arrayList);
        Collections.reverse(arrayList);

        String str = String.join("", arrayList);
        return Integer.parseInt(str);
    }
    public static int sortDesc2(final int num){

        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.parseInt(String.join("", array));
    }
}
