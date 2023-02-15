import java.util.stream.Stream;

public class PangramChecker {
    public  boolean check(String sentence){
        long cout = Stream.of(sentence.toLowerCase().split("")).distinct().filter(i -> Character.isLetter(i.charAt(0))).count();
        return cout == 26;
    }
    public boolean check2(String sentence){
        for (char c = 'a'; c <= 'z'; c++)
            if(!sentence.toLowerCase().contains("" + c))
                return false;
        return true;

    }

    public static void main(String[] args) {
        PangramChecker pangramChecker = new PangramChecker();
        System.out.println(pangramChecker.check2("y"));
    }
}
