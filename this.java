class Student 
{
    int id;
    String name;
    String department;

    Student(int id, String name, String department) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class Main
{
    public static void main(String[] args) 
    {
        Student s1 = new Student(101, "Akshaya", "CSE");
        s1.display();
    }
}
