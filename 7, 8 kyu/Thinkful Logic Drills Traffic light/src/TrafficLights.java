public class TrafficLights {

    public static String updateLight(String current) {
        return switch (current) {
            case ("red") -> "green";
            case ("yellow") -> "red";
            case ("green") -> "yellow";
            default -> "";
        };
    }

}