import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num){
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        StringBuilder str = new StringBuilder()

//                Arrays.toString(String.valueOf(num).split(""));

        System.out.println(Arrays.sort(str));

        return 0;

//        return Integer.parseInt((num+"").split("").st.reverse().join(""));
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(123));
    }



}
