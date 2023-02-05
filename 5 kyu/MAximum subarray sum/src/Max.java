public class Max {
    public static int sequence(int[] arr) {
        if (arr == null || arr.length == 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int tSum = 0;
            for (int j = i; j < arr.length; j++) {
                tSum += arr[j];
                if (tSum > sum) {
                    sum = tSum;
                }
            }
        }
        return sum;

    }

    public static int sequence2(int[] arr) {
    int max_ending_here = 0, max_so_far = 0;
        for (int i = 0; i < arr.length; i++) {
            max_ending_here += arr[i];
            if(max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

}
