public class Solution {
    public static boolean validatePin(String pin) {
//
//        for (int i = 0; i < pin.length(); i++) {
//            if(pin.charAt(i) < 48 || pin.charAt(i) > 57)
//                return false;
//        }
//        return pin.length() == 4 || pin.length() == 6;


//        return pin.matches("[0-9]{4}|[0-9]{6}");

        return pin.matches("\\d{4}|\\d{6}");
    }
}
