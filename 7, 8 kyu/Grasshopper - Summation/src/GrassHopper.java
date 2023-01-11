public class GrassHopper {

    public static int summation(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static int summation2(int n) {
        return n * (n + 1) / 2;
    }
}