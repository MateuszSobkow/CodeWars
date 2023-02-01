import java.util.stream.Stream;

public class Kata {
    public static String highAndLow(String numbers){
        int min = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
        int max = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
        return String.format("%s %s", max, min);
    }
    public static String highAndLow2(String numbers){
        var stats = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
    }
}
