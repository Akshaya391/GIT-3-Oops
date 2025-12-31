abstract class Animal
{
    // abstract method 
    abstract void sound();

    // normal method
    void eat() 
    {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal 
{

    void sound() 
    {
        System.out.println("Dog barks");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {

        Animal a = new Dog();  
        a.sound();
        a.eat();
    }
}
