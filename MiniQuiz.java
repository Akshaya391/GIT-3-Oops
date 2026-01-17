public class MiniQuiz {
    public static void main(String[] args) {
        int score = 0;
        
        // Question 1
        String answer1 = "Paris";
        if (answer1.equals("Paris")) score++;
        
        // Question 2
        int answer2 = 4;
        if (answer2 == 4) score++;
        
        // Question 3
        boolean answer3 = true;
        if (answer3 == true) score++;
        
        System.out.println("Quiz Results");
        System.out.println("===============");
        System.out.println("Score: " + score + "/3");
        System.out.println(score == 3 ? " Perfect!" : score >= 2 ? " Good job!" : " Keep learning!");
    }
}