public class Diamond {
    public static String print(int n){
        if(n <= 0 || n % 2 == 0 )
            return null;
        StringBuilder diamondBuilder = new StringBuilder();
        for (int i = 0, j = 2; i < n; i++) {
            if( i <= (n / 2)) {
                diamondBuilder.append(" ".repeat(n/2 - i)).append("*".repeat(i * 2 + 1)).append("\n");
            }
            else if (i > (n / 2)) {
                diamondBuilder.append(" ".repeat(i - n/2)).append("*".repeat((i * 2 + 1) - (j * 2))).append("\n");
                j+= 2;
            }
        }
        return diamondBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(print(7));
    }
}
