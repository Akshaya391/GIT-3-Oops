class overloading_demo
{

    void add(int a, int b)
    {
        int c = a + b;
        System.out.println(c);
    }

    void add(int a, int b, int c) 
    {
        int d = a + b + c;
        System.out.println(d);
    }

    void add(float a, float b)
    {
        float c = a + b;
        System.out.println(c);
    }
}

public class Main{

    public static void main(String[] args) 
    {

        overloading_demo obj1 = new overloading_demo();

        obj1.add(12, 12);
        obj1.add(10, 10, 10);
        obj1.add(15.2f, 15.1f);
    }
}
