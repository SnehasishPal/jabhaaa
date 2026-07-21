import java.util.Scanner;

public class piglatin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextLine()) return;

        String[] words = s.nextLine().split(" ");
        
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            int v = -1; // Will hold the index of the first vowel
            
            // Find the first vowel
            for (int j = 0; j < w.length() && v < 0; j++) {
                if ("AEIOUaeiou".indexOf(w.charAt(j)) >= 0) v = j;
            }
            
            // If v < 0 (no vowel), keep 'w'. Otherwise, split at 'v', swap, and add "ay"
            String pigLatin = (v < 0) ? w : w.substring(v) + w.substring(0, v) + "ay";
            
            // Print the word with a trailing space, or a newline if it's the last word
            System.out.print(pigLatin + (i < words.length - 1 ? " " : "\n"));
        }
        
        s.close();
    }
}