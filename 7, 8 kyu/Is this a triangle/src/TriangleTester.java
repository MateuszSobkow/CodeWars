import java.util.Arrays;
import java.util.Collections;

public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0)
            return false;
        Integer[] lengths  = new Integer[]{a ,b ,c};
        Arrays.sort(lengths, Collections.reverseOrder());
        if(lengths[2] + lengths[1] > lengths[0])
            return true;
        else return false;
    }
    public static boolean isTriangle2(int a, int b, int c){
        return a + b > c && a + c > b && c + b > a;
    }
}
