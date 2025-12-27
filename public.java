public class Student {

    // public variables
    public int rollNo = 101;
    public String name = "Akshaya";

    // public method
    public void showDetails()
 {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }

    // main method
    public static void main(String[] args) {

        // creating object
        Student s = new Student();

        // accessing public members
        s.showDetails();
    }
}
