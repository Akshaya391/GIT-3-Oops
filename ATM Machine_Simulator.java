import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000.0;
        boolean exit = false;
        
        System.out.println(" Welcome to Simple ATM");
        System.out.println("========================\n");
        
        while (!exit) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("\nChoose an option: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.printf("\n Your current balance: $%.2f\n", balance);
                    break;
                    
                case 2:
                    System.out.print("\nEnter amount to deposit: $");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("✓ Deposited $%.2f successfully!\n", deposit);
                        System.out.printf(" New balance: $%.2f\n", balance);
                    } else {
                        System.out.println("✗ Invalid amount!");
                    }
                    break;
                    
                case 3:
                    System.out.print("\nEnter amount to withdraw: $");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.printf("✓ Withdrawn $%.2f successfully!\n", withdraw);
                        System.out.printf("Remaining balance: $%.2f\n", balance);
                    } else if (withdraw > balance) {
                        System.out.println("✗ Insufficient balance!");
                    } else {
                        System.out.println("✗ Invalid amount!");
                    }
                    break;
                    
                case 4:
                    System.out.println("\n Thank you for using our ATM!");
                    exit = true;
                    break;
                    
                default:
                    System.out.println("✗ Invalid option! Please try again.");
            }
        }
        
        scanner.close();
    }
}