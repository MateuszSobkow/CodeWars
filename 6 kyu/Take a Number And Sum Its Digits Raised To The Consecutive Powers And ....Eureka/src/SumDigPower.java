import java.util.ArrayList;
import java.util.List;

public class SumDigPower {
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> listOfSumedDigPow = new ArrayList<>();
        while (a <= b) {
            double tSum = 0;

            for (int i = String.valueOf(a).length(); i > 0 ; i--) {
                tSum += Math.pow(Character.getNumericValue(String.valueOf(a).charAt(i-1)), i);

            }
            if(tSum == a)
                listOfSumedDigPow.add(a);
            a++;
        }
        return listOfSumedDigPow;
    }



    public static void main(String[] args) {
        System.out.println(sumDigPow(50,150));
    }
}
