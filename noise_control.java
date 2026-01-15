import java.util.Scanner;

// Interface
interface NoiseControl {
    void checkNoise(int level);
}

// Class implementing interface
class CityNoise implements NoiseControl {

    public void checkNoise(int level) {
        if (level <= 40) {
            System.out.println("Noise level is safe ");
        } else if (level <= 70) {
            System.out.println("Moderate noise, be careful ");
        } else {
            System.out.println("High noise! Pollution alert ");
        }
    }
}

// Main class
public class NoisePollutionSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Smart Noise Pollution Alert System ");

        System.out.print("Enter noise level (in dB): ");
        int level = sc.nextInt();

        NoiseControl nc = new CityNoise(); // interface reference
        nc.checkNoise(level);

        System.out.println("Reduce noise, improve life ");

        sc.close();
    }
}
