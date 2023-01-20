import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b){
        if(a.length == 0)
            return new int[0];
        if (b.length == 0)
            return a;
        List<Integer> listA = new ArrayList<>(Arrays.stream(a).boxed().toList());
        List<Integer> listB = new ArrayList<>(Arrays.stream(b).boxed().toList());
        listA.removeAll(listB);

        return listA.stream().mapToInt(Integer::intValue).toArray();
}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 1, 1, 2}, new int[]{2})));
    }
}


