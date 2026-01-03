// Parent class
class Details
{
    int age = 50;

    Details(String name)
    {
        System.out.println("Name: " + name);
    }

    void salary()
    {
        System.out.println("Employee gets salary on time");
    }
}

// Child class
class Emp extends Details 
{

    Emp() 
    {
        super("Ravi");        
        super.salary();       
        System.out.println("Age: " + super.age);
        System.out.println("Employee class");
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        Emp e1 = new Emp();
    }
}
