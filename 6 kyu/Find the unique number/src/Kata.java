import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kata {
    public static double findUniq(double arr[]){
        HashMap<Double, Double> mapOfDistinctIntegers = new HashMap<>();
        List<Double> resultList = new ArrayList<>();
        for (double v : arr) {
            if (!mapOfDistinctIntegers.containsValue(v)) {
                mapOfDistinctIntegers.put(v, v);
                resultList.add(v);
            } else {
                resultList.remove(v);
            }
        }
        return resultList.get(0);
    }
}
