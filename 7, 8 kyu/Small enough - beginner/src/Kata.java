import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static boolean smallEnough (int[] a, int limit){
        return Arrays.stream(a).max().getAsInt() > limit;
    }
    public static int[] multipleOfIndex(int[] array) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 1; i < array.length; i++) {
            if(array[i] % i == 0)
                resultList.add(array[i]);
        }

        return resultList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(multipleOfIndex(new int[]{1, 2, 3})));
    }
}
