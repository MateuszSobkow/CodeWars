public class Square {
    public static boolean isSquare (int n){
        int number = 0;
        number = (int)Math.sqrt(n);
        return Math.pow(number, 2) == n;
    }
    public static boolean isSquare2 (int n){
        return Math.sqrt(n)%1 == 0;
    }




        public static void main(String[] args) {
        System.out.println(isSquare(-1));
    }
}
