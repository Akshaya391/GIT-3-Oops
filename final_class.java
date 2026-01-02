// final class 
final class Bike 
{

    // final variable 
    final int speed = 80;

    // final method 
    final void run()
    {
        System.out.println("Bike is running at speed: " + speed);
    }
}

public class Main
{
    public static void main(String[] args) 
    {

        Bike b = new Bike();
        b.run();

        
    }
}
