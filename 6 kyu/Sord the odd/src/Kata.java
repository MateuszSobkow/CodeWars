import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Kata {
    public static int[] sortArray(int[] array) {
        ArrayList<Integer> listOfInt = new ArrayList<>(Arrays.stream(array).boxed().toList());
        ArrayList<Integer> listOfOddInt = new ArrayList<>();

        for (int i = 0; i < listOfInt.size(); i++) {
            if(listOfInt.get(i) % 2 == 1) {
                listOfOddInt.add(listOfInt.get(i));
                listOfInt.set(i, null);
            }
        }
        Collections.sort(listOfOddInt);
        int j = 0;
        for (int i = 0; i < listOfInt.size(); i++) {
            if(listOfInt.get(i) == null) {
                listOfInt.set(i, listOfOddInt.get(j));
                j++;
            }
        }
        return listOfInt.stream().mapToInt(i -> i).toArray();
    }
    public static int[] sortArray2(int[] array) {

        int[] sortedOdd = Arrays.stream(array).filter(e -> e%2 == 1).sorted().toArray();
        for (int i = 0, j = 0; i < array.length; i++) {
            if(array[i]%2 == 1)
                array[i] = sortedOdd[j++];
        }
        return array;
    }
        public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray2(new int[]{ 5, 3, 2, 8, 1, 4})));
    }
}
