import java.util.Scanner;

class WaterSaver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("💧 Welcome to Digital Water Saver System ");

        System.out.print("Enter total water used today (in liters): ");
        int waterUsed = sc.nextInt();

        if (waterUsed <= 100) {
            System.out.println("Great job! You saved water today");
        } else if (waterUsed <= 200) {
            System.out.println("Good, but you can save more water ");
        } else {
            System.out.println("Warning! Too much water used ");
        }

        System.out.println("Remember: Save water, save life ");

        sc.close();
    }
}
