import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("💵 Restaurant Tip Calculator");
        System.out.println("============================\n");
        
        System.out.print("Enter the bill amount: $");
        double billAmount = scanner.nextDouble();
        
        System.out.println("\nSelect tip percentage:");
        System.out.println("1. 10% (Poor service)");
        System.out.println("2. 15% (Average service)");
        System.out.println("3. 20% (Good service)");
        System.out.println("4. 25% (Excellent service)");
        System.out.print("\nYour choice: ");
        int choice = scanner.nextInt();
        
        double tipPercentage = 0;
        String serviceQuality = "";
        
        switch (choice) {
            case 1:
                tipPercentage = 10;
                serviceQuality = "Poor";
                break;
            case 2:
                tipPercentage = 15;
                serviceQuality = "Average";
                break;
            case 3:
                tipPercentage = 20;
                serviceQuality = "Good";
                break;
            case 4:
                tipPercentage = 25;
                serviceQuality = "Excellent";
                break;
            default:
                System.out.println("Invalid choice! Using 15% default.");
                tipPercentage = 15;
                serviceQuality = "Default";
        }
        
        System.out.print("\nHow many people are splitting the bill? ");
        int people = scanner.nextInt();
        
        double tipAmount = billAmount * (tipPercentage / 100);
        double totalBill = billAmount + tipAmount;
        double perPersonAmount = totalBill / people;
        
        System.out.println("\n========== BILL SUMMARY ==========");
        System.out.printf("Bill Amount:       $%.2f\n", billAmount);
        System.out.printf("Service Quality:   %s\n", serviceQuality);
        System.out.printf("Tip (%d%%):         $%.2f\n", (int)tipPercentage, tipAmount);
        System.out.printf("Total Bill:        $%.2f\n", totalBill);
        System.out.println("----------------------------------");
        System.out.printf("Split between %d people: $%.2f each\n", people, perPersonAmount);
        System.out.println("==================================");
        
        scanner.close();
    }
}