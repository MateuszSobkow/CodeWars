public class Kata {
    public static String position(char alphabet){
        return "Position of alphabet: " + ((int)Character.toLowerCase(alphabet) - 'a' + 1);
    }

    public static void main(String[] args) {
        System.out.println(position('a'));
    }
}
