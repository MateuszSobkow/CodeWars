public class Sum {
    public int GetSum(int a, int b){
        if(a == b)
            return a;
        int sum = 0;
        if(a > b){
            for (int i = 0; b + i != a + 1 ; i++) {
                sum += b + i;
            }
        } else {
            for (int i = 0; a + i != b + 1; i++) {
                sum += a + i;
            }
        }
        return sum;
    }
    public int GetSum2(int a, int b){
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}
