import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Currency Converter");
        System.out.println("=====================\n");
        
        // Exchange rates (as of example)
        final double USD_TO_EUR = 0.92;
        final double USD_TO_GBP = 0.79;
        final double USD_TO_INR = 83.12;
        final double USD_TO_JPY = 149.50;
        final double USD_TO_AUD = 1.52;
        
        System.out.print("Enter amount in USD ($): ");
        double usdAmount = scanner.nextDouble();
        
        System.out.println("\nSelect currency to convert to:");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. GBP (British Pound)");
        System.out.println("3. INR (Indian Rupee)");
        System.out.println("4. JPY (Japanese Yen)");
        System.out.println("5. AUD (Australian Dollar)");
        System.out.print("\nYour choice: ");
        int choice = scanner.nextInt();
        
        double convertedAmount = 0;
        String currencyName = "";
        String currencySymbol = "";
        
        switch (choice) {
            case 1:
                convertedAmount = usdAmount * USD_TO_EUR;
                currencyName = "Euro";
                currencySymbol = "€";
                break;
            case 2:
                convertedAmount = usdAmount * USD_TO_GBP;
                currencyName = "British Pound";
                currencySymbol = "£";
                break;
            case 3:
                convertedAmount = usdAmount * USD_TO_INR;
                currencyName = "Indian Rupee";
                currencySymbol = "₹";
                break;
            case 4:
                convertedAmount = usdAmount * USD_TO_JPY;
                currencyName = "Japanese Yen";
                currencySymbol = "¥";
                break;
            case 5:
                convertedAmount = usdAmount * USD_TO_AUD;
                currencyName = "Australian Dollar";
                currencySymbol = "A$";
                break;
            default:
                System.out.println("Invalid choice!");
                scanner.close();
                return;
        }
        
        System.out.println("\n========== CONVERSION ==========");
        System.out.printf("$%.2f USD\n", usdAmount);
        System.out.println("        ↓");
        System.out.printf("%s%.2f %s\n", currencySymbol, convertedAmount, currencyName);
        System.out.println("================================");
        System.out.println("\n Note: Exchange rates are approximate and change daily.");
        
        scanner.close();
    }
}