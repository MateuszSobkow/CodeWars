public class ASum {
    public static long findNb(long m){
        long totalVolume = 0, n = 0;
        while (totalVolume < m)
            totalVolume += ++n * n *n;
        return totalVolume == m ? n : -1;
    }
}
