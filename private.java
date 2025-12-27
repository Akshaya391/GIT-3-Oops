class Student {

    // private data members
    private int rollNo = 101;
    private String name = "Akshaya";

    // public method to access private members
    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        Student s = new Student();  // object creation
        s.display();                // accessing private data through method
    }
}
