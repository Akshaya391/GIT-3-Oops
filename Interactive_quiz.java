import java.util.Scanner;

public class InteractiveQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        
        System.out.println(" Welcome to the Quiz!\n");
        
        // Question 1
        System.out.println("Q1: What is the capital of France?");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("Paris")) {
            score++;
            System.out.println("✓ Correct!\n");
        } else {
            System.out.println("✗ Wrong! Correct answer: Paris\n");
        }
        
        // Question 2
        System.out.println("Q2: How many continents are there?");
        System.out.print("Your answer: ");
        int answer2 = scanner.nextInt();
        if (answer2 == 7) {
            score++;
            System.out.println("✓ Correct!\n");
        } else {
            System.out.println("✗ Wrong! Correct answer: 7\n");
        }
        
        // Question 3
        System.out.println("Q3: Is Java a programming language? (true/false)");
        System.out.print("Your answer: ");
        boolean answer3 = scanner.nextBoolean();
        if (answer3 == true) {
            score++;
            System.out.println("✓ Correct!\n");
        } else {
            System.out.println("✗ Wrong! Correct answer: true\n");
        }
        
        // Display results
        System.out.println("===================");
        System.out.println(" Quiz Results");
        System.out.println("===================");
        System.out.println("Score: " + score + "/3");
        
        if (score == 3) {
            System.out.println(" Perfect! You're a genius!");
        } else if (score >= 2) {
            System.out.println(" Good job! Keep it up!");
        } else {
            System.out.println(" Keep learning! You can do better!");
        }
        
        scanner.close();
    }
}