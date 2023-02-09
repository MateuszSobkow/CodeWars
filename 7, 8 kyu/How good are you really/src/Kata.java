import java.util.Arrays;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints){
        int sum = Arrays.stream(classPoints).sum() + yourPoints;
        return sum/(classPoints.length + 1) < yourPoints;
    }

}
