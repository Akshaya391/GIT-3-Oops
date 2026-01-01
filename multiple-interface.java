// Interface 1
interface ExamRules
{
    void followRules();
}

// Interface 2
interface StudentDuty
{
    void submitAssignment();
}

// Class implementing multiple interfaces
class Student implements ExamRules, StudentDuty 
{

    public void followRules()
    {
        System.out.println("Student follows exam rules");
    }

    public void submitAssignment()
    {
        System.out.println("Student submits assignment on time");
    }
}

// Main class
public class Main
{
    public static void main(String[] args)
    {

        Student s = new Student();
        s.followRules();
        s.submitAssignment();
    }
}
