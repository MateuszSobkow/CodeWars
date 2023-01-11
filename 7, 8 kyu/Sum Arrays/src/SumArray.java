import java.util.Arrays;

public class SumArray {
    public static double sum(double[] numbers){
        if(numbers.length ==0)
            return 0;
        return Arrays.stream(numbers).sum();
    }
}
