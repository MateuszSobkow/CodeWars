import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences){
        if(elements == null || elements.length == 0 || maxOccurrences ==0)
            return new int[0];
        List<Integer> listOfElements = new java.util.ArrayList<>(Arrays.stream(elements).boxed().toList());

        for (int element : elements) {
            while (Collections.frequency(listOfElements, element) > maxOccurrences)
                listOfElements.remove(listOfElements.lastIndexOf(element));
        }

        return listOfElements.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[]{1, 2, 3, 1, 2, 1, 2, 3}, 2)));

    }

}
