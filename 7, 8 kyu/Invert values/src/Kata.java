import java.util.Arrays;

public class Kata {
    public static int[] invert(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * -1;
        }
        return array;
    }

    public static int[] invert2(int[] array) {
        return Arrays.stream(array).map(i -> i * -1).toArray();
    }
}