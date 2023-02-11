public class Presist {
    public static int persistence(long n){
        int iterations = 0;
        if(n < 10)
            return 0;
        while (String.valueOf(n).length() != 1){
            int multip = 1;
            for (int i = 0; i < String.valueOf(n).length(); i++) {
                multip *= Character.getNumericValue(String.valueOf(n).charAt(i));
            }
            n = multip;
            iterations++;
        }
    return iterations;
    }
    public static int presistence2(long n) {
        int times = 0;
        while(n >= 10){
            n = Long.toString(n).chars().reduce(1, (r, i) -> r*(i - '0'));
            times++;
        }
        return times;
    }
}
