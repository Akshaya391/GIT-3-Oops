class animal 
{
    void sound() 
    {
        System.out.println("animals can make sound");
    }
}

class dog extends animal
{
    void sound()
    {
        System.out.println("dogs can bark");
    }
}

public class Main {
    public static void main(String[] args)
    {

        animal a = new animal();
        a.sound();   

        animal d = new dog();
        d.sound();   
    }
}
