import java.util.Arrays;
import java.util.List;


public class MixedSum {
    public static int sum(List<?> mixed){
        return mixed.stream().mapToInt(x -> Integer.parseInt(String.valueOf(x))).sum();
    }

    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList(5,"5")));
    }
}
