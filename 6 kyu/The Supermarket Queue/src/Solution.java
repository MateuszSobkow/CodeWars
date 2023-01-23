import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int solveSuperMarketQueue(int[] customers, int n){
        if(customers == null || customers.length == 0 || n == 0)
            return 0;
        Map<Integer, Integer> casherMap = new HashMap<>();
        boolean done = true;
        int i = 0;
        for (; i < n; i++) {
            casherMap.put(i, customers[i]);
        }
        while(done) {



        if(customers[i] == 0)
            done = false;
        }
        System.out.println(casherMap);
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[]{2,2,3,3,4,4,}, 2));
    }
}
