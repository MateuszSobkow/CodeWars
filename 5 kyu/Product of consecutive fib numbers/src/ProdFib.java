import java.util.Arrays;

public class ProdFib {
    public static long[] productFib(long prod){
        if(prod == 0)
            return new long[]{};


        long tProd = 0, Fib1 = 0, Fib2 = 1, tFib = 0;
        int n = 0;

        while (tProd < prod){
            if(n == 1){
                Fib1 = 1;
                Fib2 = 1;
            }
            if(n > 1) {
                tFib = Fib1;
                Fib1 = Fib2;
                Fib2 += tFib;

            }
            tProd = Fib1 * Fib2;
//            System.out.println(Fib1 + " " + Fib2 + " = " + tProd);
            n++;
        }

        return tProd == prod ? new long[]{Fib1, Fib2, 1} : new long[]{Fib1, Fib2, 0};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(4895)));
    }
}
