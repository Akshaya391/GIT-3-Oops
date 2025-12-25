public class FourTypesOfMethods {

    // 1. No arguments, No return value
    static void greet() {
        System.out.println("Hello! This is method 1");
    }

    // 2. With arguments, No return value
    static void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }

    // 3. No arguments, With return value
    static int getNumber() {
        return 10;
    }

    // 4. With arguments, With return value
    static int multiply(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {

        // Method 1 call
        greet();

        // Method 2 call
        add(5, 3);

        // Method 3 call
        int num = getNumber();
        System.out.println("Number = " + num);

        // Method 4 call
        int result = multiply(4, 5);
        System.out.println("Multiplication = " + result);
    }
}
