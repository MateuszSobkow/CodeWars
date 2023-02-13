import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Kata {
    public static int[] flattenAndSort(int[][]  array) {
        if(array == null || array.length == 0)
            return new int[]{};
        return Stream.of(array)
                .flatMapToInt(IntStream::of)
                .sorted()
                .toArray();
    }
    public static int[] flattenAndSort2(int[][]  array) {
        return Arrays.stream(array)
                .flatMapToInt(IntStream::of)
                .sorted()
                .toArray();
    }
}
