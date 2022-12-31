public class XO {
    public static boolean getXO (String str){

        int numberOfX = 0;
        int numberOfO = 0;
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (c == 'X' || c == 'x')
                numberOfX += 1;
            if (c == 'O' || c == 'o')
                numberOfO += 1;
        }
        return numberOfX == numberOfO;
    }

}
