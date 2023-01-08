import java.util.Arrays;

public class Kata {
    public int max(int[] list){
        return Arrays.stream(list).max().getAsInt();
    }
    public int min(int[] list){
        return Arrays.stream(list).min().getAsInt();
    }
}
