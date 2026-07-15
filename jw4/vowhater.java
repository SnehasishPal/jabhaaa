import java.util.Scanner;
import java.util.Arrays;

public class vowhater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        
        String vowels = "";
        String consonants = "";
        
        // 1. Separate the vowels and consonants
        for (char c : str.toCharArray()) {
            // If the character exists in "aeiou", it's a vowel
            if ("aeiou".indexOf(c) != -1) {
                vowels += c;
            } else {
                consonants += c;
            }
        }
        
        // 2. Convert to character arrays so we can sort them
        char[] vArr = vowels.toCharArray();
        char[] cArr = consonants.toCharArray();
        
        // 3. Sort both arrays alphabetically
        Arrays.sort(vArr);
        Arrays.sort(cArr);
        
        // 4. Print consonants first, then vowels
        System.out.println(new String(cArr) + new String(vArr));
        
        sc.close();
    }
}