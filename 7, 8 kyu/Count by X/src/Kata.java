public class Kata {
    public static int[] countBY(int x, int n){
        if(n == 0)
            return new int[0];
        int[] array = new int[n];
        for (int i = 0; i < n ; i ++) {
            array[i] = x + (i*x);
        }
        return array;
    }
}
