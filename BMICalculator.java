public class BMICalculator {
    public static void main(String[] args) {
        double weight = 90;  // kg
        double height = 1.75;  // meters
        
        double bmi = weight / (height * height);
        String category;
        
        if (bmi < 18.5) category = "Underweight";
        else if (bmi < 25) category = "Normal weight";
        else if (bmi < 30) category = "Overweight";
        else category = "Obese";
        
        System.out.printf("Weight: %.1f kg%n", weight);
        System.out.printf("Height: %.2f m%n", height);
        System.out.printf("BMI: %.2f - %s%n", bmi, category);
    }
}