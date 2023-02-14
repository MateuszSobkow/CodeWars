import java.util.Arrays;

public class Tortoise {
    public static int[] race(int v1, int v2, int g){
        if(v1 >= v2)
            return null;
        int timeToCatchInSeconds = (int) (g/((v2 - v1)/3600.0));
        int timeInHours = timeToCatchInSeconds / 3600;
        int timeInMinutes = (timeToCatchInSeconds % 3600) / 60;
        int timeInSeconds = timeToCatchInSeconds % 60;
        int[] neededTime = new int[]{0,0,0};
        neededTime[0] = timeInHours;
        neededTime[1] = timeInMinutes;
        neededTime[2] = timeInSeconds;

        return neededTime;
    }
    public static int[] race2(int v1, int v2, int g){
        if (v1 >= v2)
            return null;
        int t = 3600 * g / (v2 - v1);
        return new int[] { t / 3600, t % 3600 / 60, t % 60};
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(race(8, 10, 0)));
    }
}
