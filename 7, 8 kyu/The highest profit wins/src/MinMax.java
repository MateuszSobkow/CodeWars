import java.util.Arrays;

public class MinMax {
    public static int[] minMax(int[] arr){
        int[] result = new int[2];
        result[0] = Arrays.stream(arr).min().getAsInt();
        result[1] = Arrays.stream(arr).max().getAsInt();
        return result;
    }
}
