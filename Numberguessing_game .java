import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1; // Random number 1-100
        int attempts = 0;
        int maxAttempts = 7;
        boolean hasWon = false;
        
        System.out.println(" Number Guessing Game");
        System.out.println("=======================");
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts to guess it!\n");
        
        while (attempts < maxAttempts && !hasWon) {
            System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + " - Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == secretNumber) {
                hasWon = true;
                System.out.println("\nCongratulations! You guessed it in " + attempts + " attempts!");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try a higher number.\n");
            } else {
                System.out.println(" Too high! Try a lower number.\n");
            }
        }
        
        if (!hasWon) {
            System.out.println("\n Game Over! The number was: " + secretNumber);
        }
        
        scanner.close();
    }
}