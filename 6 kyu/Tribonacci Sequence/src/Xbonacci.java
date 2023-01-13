import java.util.Arrays;

public class Xbonacci {
      public double[] tribonacci( double[] s, int n) {
        if(s == null || s.length == 0)
            return s;
        if (n < s.length)
            return Arrays.copyOfRange(s, 0, n);

        double[] result = Arrays.copyOf(s, n);
        if(s.length == 2)
            result[2] = result[0] + result[1];
        for (int i = 0; i < n-3; i++) {
            result[i+3] = result[i] + result[i+1] + result[i+2];
        }
        return result;
    }
    public double[] tribonacci2( double[] s, int n) {
        double[] r = new double[n];
        for(int i = 0; i < n && i < 3; i++) r[i] = s[i];
        for(int i = 3; i < n; i++)
            r[i] = r[i - 1] + r[i - 2] + r[i - 3];
        return r;
    }

    public static void main(String[] args) {
        Xbonacci a = new Xbonacci();
        System.out.println(Arrays.toString(a.tribonacci2(new double[]{1, 1}, 10)));
    }
}

