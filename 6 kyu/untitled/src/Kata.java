import java.util.Arrays;

public class Kata {
    public static String[] towerBuilder(int nFloors){
        if(nFloors == 0)
            return new String[0];
        String[] tower = new String[nFloors];

        for (int i = 1; i <= nFloors; i++) {
            StringBuilder sb = new StringBuilder();
            tower[i - 1] = String.valueOf(sb.append(" ".repeat(nFloors - i)));
            tower[i - 1] = String.valueOf(sb.append("*".repeat((2 * i) - 1 )));
            tower[i - 1] = String.valueOf(sb.append(" ".repeat(nFloors - i)));
        }

        return tower;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(towerBuilder(3)));
        System.out.println(8/4);
    }
}
