import java.util.Scanner;
import java.util.Random;

public class CoinFlipGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println(" COIN FLIP GAME");
        System.out.println("=================\n");
        
        System.out.println("Choose your side:");
        System.out.println("1. Heads");
        System.out.println("2. Tails");
        System.out.print("\nYour choice: ");
        int choice = scanner.nextInt();
        
        // Generate random number (0 or 1)
        int coinFlip = random.nextInt(2);
        
        String playerChoice = (choice == 1) ? "Heads" : "Tails";
        String result = (coinFlip == 0) ? "Heads" : "Tails";
        
        System.out.println("\n Flipping the coin...");
        System.out.println("...");
        System.out.println("Result: " + result);
        
        if ((choice == 1 && coinFlip == 0) || (choice == 2 && coinFlip == 1)) {
            System.out.println("\n YOU WIN! You guessed correctly!");
        } else {
            System.out.println("\n YOU LOSE! Better luck next time!");
        }
        
        scanner.close();
    }
}