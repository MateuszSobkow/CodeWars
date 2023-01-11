import java.util.stream.IntStream;

public class Sequence{

    public static int[] reverse(int n){
        int[] result = new int[n];
        for(int i = 0; i < n; i++ ){
            result[i] = n-i;
        }
        return result;
    }
    public static int[] reverse2(int n) {
        return IntStream.range(-n, 0).map(Math::abs).toArray();

    }
}