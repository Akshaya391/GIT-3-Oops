import java.util.Scanner;

public class MoodBooster {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user's name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Ask user's mood
        System.out.print("How are you feeling today? (happy/sad/tired): ");
        String mood = sc.nextLine();

        System.out.println("\nHello " + name + "!");

        if (mood.equalsIgnoreCase("happy")) {
            System.out.println("That's awesome! Keep smiling and spread happiness");
        } 
        else if (mood.equalsIgnoreCase("sad")) {
            System.out.println("It's okay to feel sad. Tomorrow will be better");
        } 
        else if (mood.equalsIgnoreCase("tired")) {
            System.out.println("Take some rest and recharge yourself ");
        } 
        else {
            System.out.println("No matter how you feel, believe in yourself");
        }

        System.out.println("\nHave a great day!");
        sc.close();
    }
}
