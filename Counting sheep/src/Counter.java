public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps){
        int sum = 0;

            try {
                for (boolean x:arrayOfSheeps){
                    sum += x ? 1 : 0;
                }
            }
            catch(NullPointerException e){
                sum += 0;
            }

        return sum;
    }
}
