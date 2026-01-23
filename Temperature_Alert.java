import java.util.Scanner;

class TemperatureAlert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Smart Temperature Alert System ");

        System.out.print("Enter current temperature (°C): ");
        int temp = sc.nextInt();

        if (temp < 20) {
            System.out.println("Weather is cold ❄");
        } else if (temp <= 35) {
            System.out.println("Weather is normal ");
        } else {
            System.out.println("High temperature! Stay hydrated ");
        }

        System.out.println("Temperature recorded: " + temp + "°C");
        System.out.println("Take care of your health ");

        sc.close();
    }
}
