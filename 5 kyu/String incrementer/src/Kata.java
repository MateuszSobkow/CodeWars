public class Kata {
    public static String incrementString(String str){
        StringBuilder sbDigits = new StringBuilder();
        StringBuilder sbLetters = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                sbDigits.append(str.charAt(i));
            }
            else
                sbLetters.append(str.charAt(i));
        }
        if(sbDigits.length() == 0)
            return String.valueOf(sbLetters.append(1));

        StringBuilder sbDigitsPlusOne = new StringBuilder(String.valueOf(Integer.parseInt(String.valueOf(sbDigits)) + 1));
        while(sbDigitsPlusOne.length() < sbDigits.length()){
            sbDigitsPlusOne.insert(0, "0");
        }

        return (sbLetters.append(sbDigitsPlusOne)).toString();
    }

    public static void main(String[] args) {
        System.out.println(incrementString("foobar0100"));
    }
}
