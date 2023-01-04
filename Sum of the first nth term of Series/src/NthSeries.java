public class NthSeries {
    public static String seriesSum(int n){
        int i = 1;
        double result = 0;

        for (int j = 0; j < n; j++) {
            result += (double) 1 / i;
            i += 3;
        }
        return String.format("%.2f", result);
    }

}
