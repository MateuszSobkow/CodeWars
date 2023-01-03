public class Kata {
    public static String solution (String str){
//        if (str.split(" ").length == 0 )
//            return str;
//        StringBuilder reversedStr = new StringBuilder(str).reverse();
//
//        return reversedStr.toString();

        return new StringBuilder(str).reverse().toString();
    }
}
