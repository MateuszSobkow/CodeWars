import java.util.Arrays;

public class Solution {
    public static boolean check (Object[] a, Object x){
        return Arrays.asList(a).contains(x);
    }
    public static boolean check2(Object[] a, Object x){
        for (Object o:a) {
            if(o.equals(x))
                return true;
        }
    return false;
    }
}
