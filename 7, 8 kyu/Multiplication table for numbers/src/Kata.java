public class Kata {
    public static String multiTabe(int num){
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            sb.append(String.format("%d * %d = %d\n", i, num, i*num));
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(multiTabe(5));
       
    }
}
