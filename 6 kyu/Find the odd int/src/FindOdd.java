import java.util.Arrays;
import java.util.Collections;


public class FindOdd {
    public static int findIt (int[] a){
        if(a == null || a.length == 0)
            return 0;
        return Arrays.stream(a)
                .filter(i -> Collections.frequency(Arrays.stream(a).boxed().toList(), i) % 2 == 1)
                .findAny()
                .getAsInt();

    }
    public static int findIt2(int[] A) {
        int odd = 0;
        for (int item : A) {
            odd = odd ^ item;// XOR will cancel out everytime you XOR with the same number so 1^1=0 but 1^1^1=1 so every pair should cancel out leaving the odd number out
        }

        return odd;
    }

}
