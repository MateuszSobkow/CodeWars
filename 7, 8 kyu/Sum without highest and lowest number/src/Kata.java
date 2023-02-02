import java.util.Arrays;

public class Kata {
    public static int sum(int[] numbers){
        if(numbers == null ||numbers.length == 0)
            return 0;
        if(numbers.length == 1)
            return 0;

        int maxValue = Arrays.stream(numbers).max().getAsInt();
        int minValue = Arrays.stream(numbers).min().getAsInt();
        return Arrays.stream(numbers).sum() - maxValue - minValue;
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[] {1,2,3,4,5, 10, 10}));
    }
}
