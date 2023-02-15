public class RevRot {
    public static String revRot(String strng, int sz){
        if(sz <= 0)
            return "";
        if(sz > strng.length())
            return "";
        StringBuilder resultBuilder = new StringBuilder();
        int i = 0;

        while((i+1) * sz <= strng.length()) {
            String str = strng.substring(i * sz, sz * ++i);

            if(sumOfCubes(str)%2 == 0){
                resultBuilder.append(reverse(str));
            } else {
                resultBuilder.append(rotate(str));
            }
        }

        return resultBuilder.toString();
    }
    private static int sumOfCubes(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Math.pow(Character.getNumericValue(str.charAt(i)), 3);
        }
        return sum;
    }
    private static String reverse(String str){
        StringBuilder reverseBuilder = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
            reverseBuilder.insert(0, str.charAt(i));
        }
        return reverseBuilder.toString();
    }
     private static String rotate(String str){
        StringBuilder rotateBuilder = new StringBuilder(str);
        return rotateBuilder.append(str.charAt(0)).deleteCharAt(0).toString();

    }

}
