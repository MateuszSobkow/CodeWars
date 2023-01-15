
public class Kata {
    public static String countigSheep(int num){
    StringBuilder str = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            str.append(i).append(" sheep...");
        }
    return str.toString();
    }
}
