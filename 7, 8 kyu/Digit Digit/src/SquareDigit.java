
public class SquareDigit {
    public int squareDigits(int n){
        StringBuilder sb = new StringBuilder();
        String[] separatedDigits = String.valueOf(n).split("");

        for (int i = 0; i < separatedDigits.length; i++) {
            separatedDigits[i] = String.valueOf(Integer.parseInt(separatedDigits[i])*Integer.parseInt(separatedDigits[i]));
            sb.append(separatedDigits[i]);
        }
        return Integer.parseInt(String.valueOf(sb));
    }


    public static void main(String[] args) {
        SquareDigit testClass = new SquareDigit();
        System.out.println(testClass.squareDigits(9119));
    }
}
