public class StringUtils {
    public static boolean isDigit(String s){
        if(s.length() != 1)
            return false;
        return Character.isDigit(s.charAt(0));
    }
    public static boolean isDigit2(String s){
        return s.matches("[0-9]");
    }

    public static void main(String[] args) {
        System.out.println(isDigit("14"));
    }
}
