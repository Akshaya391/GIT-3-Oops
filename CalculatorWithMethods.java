public class CalculatorWithMethods {
    
    // Addition method
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Subtraction method
    public static double subtract(double a, double b) {
        return a - b;
    }
    
    // Multiplication method
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    // Division method
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
    }
    
    // Power method (a raised to power b)
    public static double power(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    
    // Square root method (approximate)
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }
    
    // Percentage method
    public static double percentage(double value, double percent) {
        return (value * percent) / 100;
    }
    
    // Method to check if number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Factorial method
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    // Method to find average of three numbers
    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    
    public static void main(String[] args) {
        System.out.println(" CALCULATOR WITH METHODS");
        System.out.println("===========================\n");
        
        // Testing Addition
        System.out.println("Addition: 15 + 7 = " + add(15, 7));
        
        // Testing Subtraction
        System.out.println("Subtraction: 20 - 8 = " + subtract(20, 8));
        
        // Testing Multiplication
        System.out.println("Multiplication: 6 × 4 = " + multiply(6, 4));
        
        // Testing Division
        System.out.println("Division: 50 ÷ 5 = " + divide(50, 5));
        
        // Testing Power
        System.out.println("Power: 2³ = " + power(2, 3));
        
        // Testing Square Root
        System.out.println("Square Root: √16 = " + squareRoot(16));
        
        // Testing Percentage
        System.out.println("Percentage: 20% of 150 = " + percentage(150, 20));
        
        // Testing Prime Check
        System.out.println("Is 17 prime? " + isPrime(17));
        
        // Testing Factorial
        System.out.println("Factorial: 5! = " + factorial(5));
        
        // Testing Average
        System.out.println("Average of 10, 20, 30 = " + average(10, 20, 30));
        
        System.out.println("\n===========================");
    }
}