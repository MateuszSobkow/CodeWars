import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary){
        StringBuilder str = new StringBuilder();
        for (int value:binary) {
            str.append(String.join("", String.valueOf(value)));
        }
        return Integer.parseInt(String.valueOf(str), 2);
    }
    public static int ConvertBinaryArrayToInt2(List<Integer> binary){
        return binary.stream().reduce((x, y) -> x * 2 + y).get();

    }

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt2(new ArrayList<>(Arrays.asList(0, 0, 1, 0))));
    }

}
