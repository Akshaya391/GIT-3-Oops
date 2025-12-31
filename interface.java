interface demo 
{
    void print();   // interface method
}

class Document implements demo
{

    public void print()
    {
        System.out.println("Printing document");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {

        demo d1 = new Document();
        d1.print();
    }
}
