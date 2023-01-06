public class Vowels {
    public static int getCount(String str){
        if(str == null || str.length() == 0)
            return 0;
        int i = 0;
        char[] c = str.toCharArray();
        for (char chars:c) {
            if(chars == 'a' || chars == 'e' || chars == 'i' || chars == 'o' || chars == 'u')
                i++;
        }
        return i;
    }
    public static int getCount2(String str){

        return str.replaceAll("(?)[^aeiou]", "").length();

    }

}
