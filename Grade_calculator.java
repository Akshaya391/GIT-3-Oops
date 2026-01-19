import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("📚 Grade Calculator");
        System.out.println("===================\n");
        
        System.out.print("Enter marks for Subject 1: ");
        double sub1 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 2: ");
        double sub2 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 3: ");
        double sub3 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 4: ");
        double sub4 = scanner.nextDouble();
        
        System.out.print("Enter marks for Subject 5: ");
        double sub5 = scanner.nextDouble();
        
        double total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (total / 500) * 100;
        String grade;
        
        if (percentage >= 90) {
            grade = "A+ (Excellent)";
        } else if (percentage >= 80) {
            grade = "A (Very Good)";
        } else if (percentage >= 70) {
            grade = "B (Good)";
        } else if (percentage >= 60) {
            grade = "C (Average)";
        } else if (percentage >= 50) {
            grade = "D (Pass)";
        } else {
            grade = "F (Fail)";
        }
        
        System.out.println("\n========== RESULT ==========");
        System.out.println("Total Marks: " + total + "/500");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("============================");
        
        scanner.close();
    }
}