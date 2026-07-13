import java.util.Scanner;

public class dd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the whole line and split it into an array of words
        String[] words = sc.nextLine().split(" ");
        String result = "";
        
        // Loop through each word
        for (String w : words) {
            // w.substring(1) gets everything EXCEPT the first letter
            // w.charAt(0) gets ONLY the first letter
            result += w.substring(1) + w.charAt(0) + "ay ";
        }
        
        // Print the final result, using trim() to chop off the extra trailing space
        System.out.println(result.trim());
        
        sc.close();
    }
}