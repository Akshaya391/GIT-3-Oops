import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Morse Code Translator");
        System.out.println("========================\n");
        
        System.out.print("Enter text to convert to Morse Code: ");
        String input = scanner.nextLine().toUpperCase();
        
        String morseCode = "";
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            switch (c) {
                case 'A': morseCode += ".- "; break;
                case 'B': morseCode += "-... "; break;
                case 'C': morseCode += "-.-. "; break;
                case 'D': morseCode += "-.. "; break;
                case 'E': morseCode += ". "; break;
                case 'F': morseCode += "..-. "; break;
                case 'G': morseCode += "--. "; break;
                case 'H': morseCode += ".... "; break;
                case 'I': morseCode += ".. "; break;
                case 'J': morseCode += ".--- "; break;
                case 'K': morseCode += "-.- "; break;
                case 'L': morseCode += ".-.. "; break;
                case 'M': morseCode += "-- "; break;
                case 'N': morseCode += "-. "; break;
                case 'O': morseCode += "--- "; break;
                case 'P': morseCode += ".--. "; break;
                case 'Q': morseCode += "--.- "; break;
                case 'R': morseCode += ".-. "; break;
                case 'S': morseCode += "... "; break;
                case 'T': morseCode += "- "; break;
                case 'U': morseCode += "..- "; break;
                case 'V': morseCode += "...- "; break;
                case 'W': morseCode += ".-- "; break;
                case 'X': morseCode += "-..- "; break;
                case 'Y': morseCode += "-.-- "; break;
                case 'Z': morseCode += "--.. "; break;
                case '0': morseCode += "----- "; break;
                case '1': morseCode += ".---- "; break;
                case '2': morseCode += "..--- "; break;
                case '3': morseCode += "...-- "; break;
                case '4': morseCode += "....- "; break;
                case '5': morseCode += "..... "; break;
                case '6': morseCode += "-.... "; break;
                case '7': morseCode += "--... "; break;
                case '8': morseCode += "---.. "; break;
                case '9': morseCode += "----. "; break;
                case ' ': morseCode += "/ "; break;
                default: morseCode += "[?] ";
            }
        }
        
        System.out.println("\n Morse Code:");
        System.out.println(morseCode);
        System.out.println("\nKey: . = dot, - = dash, / = space");
        
        scanner.close();
    }
}