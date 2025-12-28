class Student {

    int id;
    String name;

    // Default constructor
    Student() {
        id = 0;
        name = "Unknown";
    }

    // Parameterized constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();              // default constructor
        Student s2 = new Student(101, "Akshaya"); // parameterized constructor

        s1.display();
        s2.display();
    }
}
