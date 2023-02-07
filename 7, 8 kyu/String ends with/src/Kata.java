public class Kata {
    public static boolean solution(String str, String ending){
        if(str.length() < ending.length())
            return false;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ending.length(); i++) {
            sb.append(str.charAt((str.length()) - (ending.length()- i)));
        }
        return  sb.toString().equals(ending);
    }
    public static boolean soulutin2(String str, String ending){
        return str.endsWith(ending);
    }

    public static void main(String[] args) {
        System.out.println(solution("samurai", "ai"));
    }

}
