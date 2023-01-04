import java.util.Arrays;

public class Kata{
    public static double find_average(int[] array){
        int average = 0;
        if (array.length == 0) {
            return 0;
        }
        for (int a : array){
            average += a;
        }
        return average/array.length;
    }
    public static double finde_average2 (int[] array){
        return Arrays.stream(array).average().orElse(0);
    }
}