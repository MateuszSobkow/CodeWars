import java.util.Arrays;
import java.util.stream.Collectors;

public class Minimum {
    public static int minValue(int[]values){
        int[] sortedDisticntArr = Arrays.stream(values).sorted().distinct().toArray();
        // sorted before distinct because "WWhen you chain a distinct() operation after sorted(),
        // he implementation will utilize the sorted nature of the data and avoid building an internal HashSet, which can be demonstrated by the following program"
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sortedDisticntArr.length ; i++) {
            sb.append(sortedDisticntArr[i]);
        }
        return Integer.parseInt(sb.toString());
    }
    public static int minValue2(int[] values){
        String str = Arrays.stream(values).sorted().distinct().mapToObj(Integer::toString).collect(Collectors.joining(""));
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.println(minValue(new int[] {1,3,1, 5}));
    }
}
