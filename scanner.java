import java.util.Scanner;

public class Math {

    void even_or_odd(int num) {
        if (num % 2 == 0) {
            System.out.println("It is an Even number");
        } else {
            System.out.println("It is an Odd number");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        Math obj1 = new Math();
        obj1.even_or_odd(num);
    }
}
