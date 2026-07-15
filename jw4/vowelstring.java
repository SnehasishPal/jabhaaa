import java.util.Scanner;
public class vowelstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase(); // Read input and make it lowercase
        
        int count = 0;
        boolean inConsonantGroup = false;
        
        for (char c : s.toCharArray()) {
            // 1. If we hit a vowel, the consonant group ends
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                inConsonantGroup = false; 
            } 
            // 2. If it's a consonant AND we aren't already tracking a group
            else if (!inConsonantGroup) {
                count++;                 // Count this as a new group
                inConsonantGroup = true; // Mark that we are now inside a group
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}