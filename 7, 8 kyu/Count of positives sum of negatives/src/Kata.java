import java.util.Arrays;

public class Kata  {
    public static int[] countPositivesSumNegatives(int[] input){
        if (input == null || input.length == 0)
            return new int[0];
        int[] array = new int[2];
        array[0] = (int) Arrays.stream(input).filter(x -> x > 0).count();
        array[1] = Arrays.stream(input).filter(x -> x < 0).sum();
        return array;

    }
}
