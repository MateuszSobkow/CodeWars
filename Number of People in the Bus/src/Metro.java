import java.util.ArrayList;

public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        int numberOfPeople = 0;
        System.out.println(stops);
        for (int[] a : stops) {
            for (int i = 0; i < a.length; i++) {
                if (i == 0)
                    numberOfPeople += a[i];
                else if (i == 1) {
                    numberOfPeople -= a[i];
                }
            }
        }
        return numberOfPeople;
    }
    public static int countPassengers2 (ArrayList<int[]> stops){
        return stops.stream().mapToInt(x -> x[0] - x[1]).sum();
    }
}

