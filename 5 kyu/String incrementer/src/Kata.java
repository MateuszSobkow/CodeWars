import java.math.BigInteger;

public class Kata {
    public static String incrementString(String str){
        StringBuilder sbDigits = new StringBuilder();
        int i;

        for (i = str.length() - 1; i >= 0; i--) {
            if(Character.isDigit(str.charAt(i))){
                sbDigits.append(str.charAt(i));
            }
            else
               break;
        }

        sbDigits.reverse();
        if(sbDigits.length() == 0)
            return str + "1";

        BigInteger bigInteger = new BigInteger(sbDigits.toString());
        StringBuilder sbDigitsPlusOne = new StringBuilder(bigInteger.add(BigInteger.valueOf(1)).toString());

        while(sbDigitsPlusOne.length() < sbDigits.length()){
            sbDigitsPlusOne.insert(0, "0");
        }

        return str.substring(0, i+1) + sbDigitsPlusOne;
    }

    public static void main(String[] args) {
        System.out.println(incrementString("foobar001"));
    }
}
