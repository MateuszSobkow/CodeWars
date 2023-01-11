import java.util.Arrays;

public class Kata {
    public static int grow(int[] x) {
        int result = 1;
        for (int i : x) {
            result *= i;
        }
        return result;
    }

    public static int grow2(int[] x) {
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }
}
