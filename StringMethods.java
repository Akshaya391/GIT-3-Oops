public class StringMethodsDemo {
    
    // Method to reverse a string
    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }
    
    // Method to count vowels
    public static int countVowels(String text) {
        int count = 0;
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
    
    // Method to check if string is palindrome
    public static boolean isPalindrome(String text) {
        String reversed = reverseString(text);
        return text.equalsIgnoreCase(reversed);
    }
    
    // Method to count words in a sentence
    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
    
    // Method to capitalize first letter of each word
    public static String capitalizeWords(String text) {
        String[] words = text.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > 0) {
                String capitalized = words[i].substring(0, 1).toUpperCase() + 
                                   words[i].substring(1).toLowerCase();
                result += capitalized + " ";
            }
        }
        return result.trim();
    }
    
    // Method to remove spaces from string
    public static String removeSpaces(String text) {
        return text.replace(" ", "");
    }
    
    // Method to count specific character
    public static int countCharacter(String text, char target) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
    
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();
        
        if (str1.length() != str2.length()) {
            return false;
        }
        
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        
        return java.util.Arrays.equals(arr1, arr2);
    }
    
    public static void main(String[] args) {
        System.out.println("📝 STRING METHODS DEMONSTRATION");
        System.out.println("================================\n");
        
        String testString = "Hello World";
        
        // Test reverse
        System.out.println("Original: " + testString);
        System.out.println("Reversed: " + reverseString(testString));
        System.out.println();
        
        // Test vowel count
        System.out.println("Vowels in 'Hello World': " + countVowels(testString));
        System.out.println();
        
        // Test palindrome
        String word1 = "radar";
        System.out.println("Is '" + word1 + "' a palindrome? " + isPalindrome(word1));
        System.out.println();
        
        // Test word count
        String sentence = "Java programming is fun and easy";
        System.out.println("Sentence: " + sentence);
        System.out.println("Word count: " + countWords(sentence));
        System.out.println();
        
        // Test capitalize
        String lowercase = "hello world from java";
        System.out.println("Original: " + lowercase);
        System.out.println("Capitalized: " + capitalizeWords(lowercase));
        System.out.println();
        
        // Test remove spaces
        String withSpaces = "Java Is Awesome";
        System.out.println("With spaces: " + withSpaces);
        System.out.println("Without spaces: " + removeSpaces(withSpaces));
        System.out.println();
        
        // Test count character
        String text = "programming";
        char target = 'g';
        System.out.println("Count of '" + target + "' in '" + text + "': " + countCharacter(text, target));
        System.out.println();
        
        // Test anagrams
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + areAnagrams(str1, str2));
        
        System.out.println("\n================================");
    }
}