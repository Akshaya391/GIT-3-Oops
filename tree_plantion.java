import java.util.Scanner;

class TreePlantation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to Tree Plantation System ");

        System.out.print("Enter number of trees planted today: ");
        int trees = sc.nextInt();

        if (trees == 0) {
            System.out.println("Please plant at least one tree ");
        } else if (trees < 5) {
            System.out.println("Good start! Plant more trees ");
        } else {
            System.out.println("Excellent! You are saving the Earth ");
        }

        System.out.println("Trees planted today: " + trees);
        System.out.println("Plant trees, protect future ");

        sc.close();
    }
}
