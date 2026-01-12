import java.util.Scanner;

// Parent class
class Energy {
    int units;

    void inputUnits(int u) {
        units = u;
    }
}

// Child class (Inheritance)
class SolarEnergy extends Energy {

    void showMessage() {
        if (units <= 100) {
            System.out.println("Excellent! You are using green energy ");
        } else if (units <= 300) {
            System.out.println("Good usage, try to save more energy ");
        } else {
            System.out.println("High consumption! Save energy ")
        }
    }
}

// Main class (must be public)
public class GreenEnergySystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Green Energy Awareness System ");

        System.out.print("Enter solar energy units used: ");
        int u = sc.nextInt();

        SolarEnergy se = new SolarEnergy();
        se.inputUnits(u);     // inherited method
        se.showMessage();     // child method

        System.out.println("Units used: " + u);
        System.out.println("Save energy, save Earth ");

        sc.close();
    }
}
