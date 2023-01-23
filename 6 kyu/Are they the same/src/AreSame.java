import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b){
       if(a == null || b == null || a.length != b.length)
           return false;

        for (int i = 0; i < a.length ; i++) {
            a[i] *= a[i];
        }
        Arrays.sort(a); Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i])
                return false;
        }
        return true;

    }
    public static boolean comp2(int[] a, int[] b){
        if (a == null || b == null || a.length != b.length)
            return false;
         a = Arrays.stream(a).map(Math::abs).toArray();
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if((int)Math.pow(a[i], 2) != b[i])
                return false;
        }
    return true;
    }
}
