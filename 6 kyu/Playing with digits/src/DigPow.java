import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DigPow {
    public static long digPow(int n, int p) {
        int[] digits = Integer.toString(n).chars().map(c -> c - '0').toArray();
        int sumResult = 0;
        for (int i = 0; i < digits.length; i++) {
            sumResult += Math.pow(digits[i], (p+i));
        }
        return sumResult % n == 0 ? sumResult/n : -1;
    }
    public static long digPow2(int n, int p) {
      int[] digits = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
      int sum = IntStream.range(0, digits.length).map(o -> (int) Math.pow(digits[o], o+p)).sum();
      return sum%n == 0 ? sum/n : -1;
    }


        public static void main(String[] args) {
        System.out.println(digPow(89, 1));
    }
}
