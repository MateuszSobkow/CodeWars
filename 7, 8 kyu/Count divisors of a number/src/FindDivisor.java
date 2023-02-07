import java.util.stream.Stream;

public class FindDivisor {
    public long numberOfDivisors(int n){
        long numberOfDivisors = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0 )
                numberOfDivisors++;
        }
        return numberOfDivisors;
    }
}
