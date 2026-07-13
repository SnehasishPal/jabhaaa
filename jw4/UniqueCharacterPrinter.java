import java.util.Scanner;

public class UniqueCharacterPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String input = scanner.nextLine();
        
        String result = ""; // Start with an empty string
        
        // Loop through each character of the input
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            // indexOf returns -1 if the character is NOT found in the string
            if (result.indexOf(c) == -1) {
                result += c; // Add it to our result
            }
        }
        
        System.out.println("Output: " + result);
        scanner.close();
    }
}