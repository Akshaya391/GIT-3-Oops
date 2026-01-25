public class MethodsDemo {
    
    // 1. METHOD WITH NO PARAMETERS AND NO RETURN VALUE (void)
    public static void greetUser() {
        System.out.println("Hello! Welcome to Java Methods!");
        System.out.println("This method doesn't take input or return anything.\n");
    }
    
    // 2. METHOD WITH PARAMETERS BUT NO RETURN VALUE (void)
    public static void displayUserInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("This method takes input but returns nothing.\n");
    }
    
    // 3. METHOD WITH NO PARAMETERS BUT RETURNS A VALUE
    public static String getCurrentDay() {
        return "Monday";  // Returns a String value
    }
    
    // 4. METHOD WITH PARAMETERS AND RETURNS A VALUE
    public static int addNumbers(int num1, int num2) {
        int sum = num1 + num2;
        return sum;  // Returns an integer
    }
    
    // 5. METHOD THAT RETURNS BOOLEAN
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    // 6. METHOD WITH MULTIPLE PARAMETERS AND CALCULATIONS
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    // 7. METHOD THAT CALLS ANOTHER METHOD
    public static void displayCalculation(int a, int b) {
        int result = addNumbers(a, b);  // Calling another method
        System.out.println(a + " + " + b + " = " + result);
    }
    
    // 8. METHOD WITH STRING RETURN TYPE
    public static String getGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else {
            return "F";
        }
    }
    
    // 9. METHOD TO FIND MAXIMUM OF TWO NUMBERS
    public static int findMax(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    
    // 10. METHOD TO CHECK IF NUMBER IS POSITIVE, NEGATIVE, OR ZERO
    public static String checkNumber(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }
    
    // MAIN METHOD - Program starts here
    public static void main(String[] args) {
        System.out.println("========== JAVA METHODS DEMONSTRATION ==========\n");
        
        // Calling Method 1
        System.out.println("1. Method with no parameters, no return:");
        greetUser();
        
        // Calling Method 2
        System.out.println("2. Method with parameters, no return:");
        displayUserInfo("Alice", 25);
        
        // Calling Method 3
        System.out.println("3. Method with no parameters, returns value:");
        String day = getCurrentDay();
        System.out.println("Today is: " + day + "\n");
        
        // Calling Method 4
        System.out.println("4. Method with parameters, returns value:");
        int sum = addNumbers(10, 20);
        System.out.println("Sum: " + sum + "\n");
        
        // Calling Method 5
        System.out.println("5. Method returns boolean:");
        boolean result = isEven(10);
        System.out.println("Is 10 even? " + result + "\n");
        
        // Calling Method 6
        System.out.println("6. Method calculates area:");
        double area = calculateArea(5.5, 3.0);
        System.out.println("Area: " + area + "\n");
        
        // Calling Method 7
        System.out.println("7. Method that calls another method:");
        displayCalculation(15, 25);
        System.out.println();
        
        // Calling Method 8
        System.out.println("8. Method returns String:");
        String grade = getGrade(85);
        System.out.println("Grade for 85 marks: " + grade + "\n");
        
        // Calling Method 9
        System.out.println("9. Method finds maximum:");
        int max = findMax(45, 67);
        System.out.println("Maximum of 45 and 67: " + max + "\n");
        
        // Calling Method 10
        System.out.println("10. Method checks number type:");
        String type = checkNumber(-5);
        System.out.println("-5 is: " + type + "\n");
        
        System.out.println("============================================");
    }
}