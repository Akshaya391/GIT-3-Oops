import java.util.Scanner;

class FoodWasteMonitor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🍽️ Welcome to Smart Food Waste Monitor ");

        System.out.print("Enter number of meals prepared today: ");
        int prepared = sc.nextInt();

        System.out.print("Enter number of meals wasted today: ");
        int wasted = sc.nextInt();

        int saved = prepared - wasted;

        if (saved == prepared) {
            System.out.println("Excellent! No food waste today ");
        } else if (wasted <= 2) {
            System.out.println("Good job! Very little food wasted ");
        } else {
            System.out.println("Alert! Try to reduce food waste ");
        }

        System.out.println("Meals saved today: " + saved);
        System.out.println("Save food, share food, spread love ");

        sc.close();
    }
}
