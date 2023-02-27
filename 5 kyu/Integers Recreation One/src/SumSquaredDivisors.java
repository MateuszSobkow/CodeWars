
public class SumSquaredDivisors {
    public static String listSquared(long m, long n){
        StringBuilder builder = new StringBuilder("[");

        for (long i = m; i <= n ; i++) {
            long sum = 0;
            for (long j = 1; j <= i ; j++) {
                if(i % j == 0)
                    sum+=Math.pow(j, 2);
            }
            if(sum == Math.pow((long)Math.sqrt(sum), 2)){

                builder.append("[").append(i).append(", ").append(sum).append("]").append(", ");
            }
        }
        return builder.length() > 1 ?  builder.substring(0, builder.length() - 2) + "]" : "[]";
    }

    public static void main(String[] args) {
        System.out.println(listSquared(1, 250));
    }
}
