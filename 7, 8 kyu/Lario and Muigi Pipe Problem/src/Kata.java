public class Kata {
    public static int[] pipeFix(int[] numbers){
        int[] n = new int[(numbers[numbers.length-1] - numbers[0]) + 1];
        for (int i = 0; i < n.length; i++) {
            n[i] = numbers[0] + i;
        }
        return n;
    }
}
