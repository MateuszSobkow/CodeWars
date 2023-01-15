import static java.util.Arrays.stream;

public class Codewars {
    public static String oddOrEven (int[] array) {
        if (array.length == 0)
            return "even";
        return stream(array).reduce(Integer::sum).getAsInt() % 2 == 0 ? "even" : "odd";
    }
    public static String oddOrEven2 (int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}