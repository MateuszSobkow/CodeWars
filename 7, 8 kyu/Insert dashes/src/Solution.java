public class Solution {
    public static String insertDash(int num){
        StringBuilder sb = new StringBuilder();
        String stringValueOfNumber = String.valueOf(num);

        for (int i = 0; i < stringValueOfNumber.length(); i++) {
            sb.append(stringValueOfNumber.charAt(i));
            if(i == stringValueOfNumber.length() - 2){
                if (stringValueOfNumber.charAt(i)%2 == 1 & stringValueOfNumber.charAt(i+1)%2 == 1)
                    sb.append("-");
                sb.append(stringValueOfNumber.charAt(i+1));
                break;
            }
            if(stringValueOfNumber.charAt(i)%2 == 1 && stringValueOfNumber.charAt(i+1)%2 == 1){
                sb.append("-");
            }
        }
        return sb.toString();
    }
    public static String insertDash2(int num){
        return (num+"").replaceAll("([13579])(?=[13579])", "$1-");
    }

    public static void main(String[] args) {
        System.out.println(insertDash2(1235678));
    }
}
