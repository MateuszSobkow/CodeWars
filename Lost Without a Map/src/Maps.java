import java.util.Arrays;
import java.util.stream.Stream;

public class Maps {
    public static int[] map(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] *= 2;
//        }
//        return arr;

        return Arrays.stream(arr).map(x -> x*2).toArray();

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[]{1, 2, 3})));
    }
}
