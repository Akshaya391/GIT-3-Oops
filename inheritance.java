class animal
{
    void eat()
    {
        System.out.println("eating");
    }
}

class dog extends animal
{
    void bark() 
    {
        System.out.println("barking");
    }
}

class cat extends animal 
{
    void meow()
    {
        System.out.println("meowing");
    }
}

public class Main 
{
    public static void main(String[] args)
    {
        dog d1 = new dog();
        d1.eat();
        d1.bark();

        cat c1 = new cat();
        c1.eat();
        c1.meow();
    }
}
