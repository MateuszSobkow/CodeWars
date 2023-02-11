
public class Solution {
    public static int[] twoSum(int[] numbers, int target){
        int j = 0;
        int[] result = new int[2];
        boolean done = true;
        while(done) {
            for (int i = 0 ; i < numbers.length; i++ ){
                if(i == j)
                    continue;
                if(numbers[j] + numbers[i] == target) {
                    result[0] = j;
                    result[1] = i;
                    done = false;
                }
            }
            if(j < numbers.length)
                j++;

        }
        return result;

    }
}
