import java.util.Arrays;

public class ZywOo {
    public static int[] take(int[] arr, int n){
        if(n == 0 || arr == null || arr.length == 0)
            return new int[0];
        if(n > arr.length)
            return arr;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
        }
        return result;
    }
    public static int[] take2(int[] arr, int n ){
        return Arrays.copyOf(arr, Math.min(n, arr.length));
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(take(new int[]{1, 2, 3, 4, 5}, 0)));
    }

}
