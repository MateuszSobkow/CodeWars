public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String str = "";
        for (int i = 0; i < repeat; i++){
            str = str + string;

        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(4, "a"));
    }
}
