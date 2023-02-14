public class Evaporator {
    public static int evaporator(double content, double evap_per_day, double threshold){
        int days = 0;
        double percentage = 100;
        while(percentage > threshold){
            percentage =  (percentage - percentage * (evap_per_day / 100.0));
            days++;
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println(evaporator(10 ,10, 10));
    }
}
