public class isogram {
    public static boolean isIsogram(String str){
        if(str == null || str.length() == 0)
            return true;

        char[] c = str.toLowerCase().toCharArray();
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if(i == j)
                    break;
                else if (c[i] == c[j])
                    return false;
            }
        }
        return true;
    }
    public static boolean isIsogram2(String str){
        System.out.println(str.toLowerCase().chars().distinct().count());
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
