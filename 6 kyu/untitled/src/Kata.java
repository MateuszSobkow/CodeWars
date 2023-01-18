import java.util.Arrays;

public class Kata {
    public static String[] towerBuilder(int nFloors){
        if(nFloors == 0)
            return new String[0];
        String[] tower = new String[nFloors], star = new String[nFloors], space = new String[nFloors];

        for (int i = 1; i <= nFloors; i++) {
            space[i - 1] = " ".repeat(nFloors - i);
            star[i - 1] = "*".repeat((2 * i) - 1 );
            tower[i - 1] = space[i - 1] + star[i - 1] + space[i - 1];
        }

        return tower;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(towerBuilder(3)));
    }
}
