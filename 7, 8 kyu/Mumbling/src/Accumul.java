public class Accumul {
    public static String accum(String s){
        if (s == null || s.length() == 0)
            return s;
        StringBuilder sb = new StringBuilder();
        char[] c = s.toLowerCase().toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 1; j <= i + 1; j++) {
                if(j == 1)
                    sb.append(Character.toUpperCase(c[i]));
                else
                    sb.append(c[i]);
            }
            if(i != s.length() -1)
                sb.append("-");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("abc"));
    }
}
