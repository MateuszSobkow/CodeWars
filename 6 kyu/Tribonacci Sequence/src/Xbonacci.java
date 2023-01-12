import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.DoubleStream;

public class Xbonacci {
    public double[] tribonacci( double[] s, int n) {
        if(n == 0 )
            return new double[n];
        if(s.length > n)
            return

        double[] result = new double[n];
        int i = 0;
        for (double d:s) {
            result[i] = d;
            i++;
        }




        if (s.length == 2 && n > 2)
           result[2] = result[0] + result[1];

        for (i = 0; i < n-3; i++) {
            result[i+3] = result[i] + result[i+1] + result[i+2];
        }
        return result;
    }

    public static void main(String[] args) {
        Xbonacci a = new Xbonacci();
        System.out.println(Arrays.toString(a.tribonacci(new double[]{13.0,12.0,9.0}, 10)));
    }
}

