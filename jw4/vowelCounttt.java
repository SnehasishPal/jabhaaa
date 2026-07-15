import java.util.Scanner;

public class vowelCounttt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input string
        String str = sc.next();
        
        // Initialize counters for each vowel
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        
        // Loop through each character in the string
        for (char c : str.toCharArray()) {
            if (c == 'a') a++;
            else if (c == 'e') e++;
            else if (c == 'i') i++;
            else if (c == 'o') o++;
            else if (c == 'u') u++;
        }
        
        // Print the result matching the sample output format
        System.out.println("a:" + a + " e:" + e + " i:" + i + " o:" + o + " u:" + u);
        
        sc.close();
    }
}