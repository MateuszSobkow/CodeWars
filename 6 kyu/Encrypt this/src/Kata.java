
public class Kata {
    public static String encryptThis(String text){
        if(text == null || text.length() == 0)
            return "";
        String[] tabOfWords = text.split(" ");
        StringBuilder encrypted = new StringBuilder();
        for (String word:tabOfWords) {
            if (word.length() > 3) {
                char first = word.charAt(0);
                char second = word.charAt(1);
                char last = word.charAt(word.length() - 1);
                encrypted.append((int) first).append(last).append(word, 2, word.length() - 1).append(second).append(" ");
            } else if (word.length() == 3) {
                char first = word.charAt(0);
                char second = word.charAt(1);
                char last = word.charAt(word.length() - 1);
                encrypted.append((int) first).append(last).append(second).append(" ");

            } else if(word.length() == 2) {
                encrypted.append((int)word.charAt(0)).append(word.charAt(1)).append(" ");
            }
            else {
                encrypted.append((int)word.charAt(0)).append(" ");
            }

        }
        return encrypted.toString().trim();
    }

    public static void main(String[] args) {
//        System.out.println(encryptThis("A wise old owl lived in an oak"));
//        System.out.println(encryptThis("A"));
        System.out.println(encryptThis("wise"));
        System.out.println("119esi");
//        System.out.println(encryptThis("old"));
//        System.out.println(encryptThis("owl"));
//        System.out.println(encryptThis("lived"));
//        System.out.println(encryptThis("in"));
//        System.out.println(encryptThis("an"));
//        System.out.println(encryptThis("oak"));
    }
}
