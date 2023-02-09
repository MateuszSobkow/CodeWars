import java.util.stream.IntStream;

public class CountDig {
    public static int nbDig(int n, int d){
        return (int) IntStream.rangeClosed(0, n)
                .flatMap(i -> String.valueOf(i * i).chars())
                .filter(i -> i == (char)(d + '0'))
                .count();
    }

    public static void main(String[] args) {
        System.out.println(nbDig(11011,2));
    }
}
