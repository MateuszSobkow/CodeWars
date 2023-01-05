
public class JadenCase {
    public String toJadenCase(String phrase){
        if(phrase == null ||phrase.length() == 0)
            return null;
        String [] tabOfString = phrase.split(" ");
        for (int i = 0; i < tabOfString.length; i++) {
            tabOfString[i] = tabOfString[i].substring(0, 1).toUpperCase() + tabOfString[i].substring(1);
        }
       return String.join(" ", tabOfString);
    }
    public String toJadenCase2(String phrase){
        return null;
    }

    public static void main(String[] args) {
        JadenCase a = new JadenCase();
        System.out.println(a.toJadenCase(null));
    }
}
