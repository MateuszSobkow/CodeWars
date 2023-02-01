import java.util.*;

public class Solution {
    public static int solveSuperMarketQueue(int[] customers, int n){
        if(customers == null || customers.length == 0 || n == 0)
            return 0;
       List<Integer> cashBox = new ArrayList<>();
       int OverallTime = 0;
       int i = 0;
       boolean done = true;
        for (i = 0; i < n; i++) {
            if(i >= customers.length)
                break;
            cashBox.add(customers[i]);
        }

       while(done){
           if(cashBox.stream().anyMatch(x -> x.equals(0))){
               for (Integer timeLeft:cashBox) {
                   if(timeLeft == 0 && i < customers.length) {
                       cashBox.set(cashBox.indexOf(timeLeft), customers[i]);
                        i++;
                   }
               }
           }
           cashBox.replaceAll(integer -> integer - 1);
            OverallTime++;

            if(cashBox.stream().noneMatch(x -> x > 0) && i == customers.length)
                done = false;
       }

        return OverallTime;
    }
    public static int solveSuperMarketQueue2(int[] customers, int n){
        int[] result = new int[n];
        for (int i = 0; i < customers.length; i++) {
            result[0]+= customers[i];
            Arrays.sort(result);
        }
        return result[n-1];
    }

    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue2(new int[]{2,2,3,3,4,5}, 2));
    }
}
