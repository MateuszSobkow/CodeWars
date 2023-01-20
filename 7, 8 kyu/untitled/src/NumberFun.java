import static java.lang.Math.*;
public class NumberFun {
    public static long findNextSquare(long sq) {
        long sqrtValue = (long)sqrt(sq);
        return sq == pow(sqrtValue, 2) ? (long) pow(sqrtValue + 1, 2) : -1;

    }
}