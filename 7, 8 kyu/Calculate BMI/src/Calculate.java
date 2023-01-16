public class Calculate {
    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        return bmi <= 18.5 ? "Underweight" : (bmi <= 25.0) ? "Normal" : (bmi <= 30) ? "Overweight" : (bmi > 30) ? "Obese" : null;
    }

    public static String bmi2(double weight, double height) {

        double bmi = weight / (height * height);

        if (bmi <= 18.5) return "Underweight";
        if (bmi <= 25) return "Normal";
        if (bmi <= 30) return "Overweight";
        return "Obese";

    }
}

