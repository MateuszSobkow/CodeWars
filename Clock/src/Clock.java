

public class Clock {
    public static int Past(int h, int m, int s ){

        int result = h * 3600000;
        result += m * 60000;
        result += s * 1000;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Past(21, 51 ,48));
    }
}
