public class Kata {
    public static String expandedForm(int num){
       String numberInString = String.valueOf(num);
       StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberInString.length(); i++) {
            if(numberInString.charAt(i) == '0')
                continue;
            sb.append(numberInString.charAt(i)).append("0".repeat(numberInString.length() - (i+ 1))).append(" + ");

        }
               return sb.substring(0, sb.length() - 3).trim();
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(70304));
    }
}
