public class Solution {

    public static String doubleChar(String s){
//        String str = "";
//        for (int i = 0; i < s.length(); i++) {
//            str = str + s.charAt(i) + s.charAt(i);
//        }
//        return str;

        return s.replaceAll(".", "$0$0"); // take every letter and double it (more $0 == more letter rep)
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
    }
}
