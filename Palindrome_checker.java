import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Palindrome Checker");
        System.out.println("=====================\n");
        
        System.out.print("Enter a word or number: ");
        String input = scanner.nextLine();
        
        // Remove spaces and convert to lowercase
        String cleaned = input.replace(" ", "").toLowerCase();
        
        // Reverse the string
        String reversed = "";
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed += cleaned.charAt(i);
        }
        
        // Check if palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("\n✓ '" + input + "' is a PALINDROME!");
            System.out.println("It reads the same forwards and backwards: " + cleaned);
        } else {
            System.out.println("\n✗ '" + input + "' is NOT a palindrome.");
            System.out.println("Forward: " + cleaned);
            System.out.println("Backward: " + reversed);
        }
        
        scanner.close();
    }
}