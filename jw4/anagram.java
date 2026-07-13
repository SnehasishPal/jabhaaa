import java.util.Arrays;
import java.util.Scanner;

public class anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            String str1 = sc.next();
            String str2 = sc.next();
            
            // The 1-line sort and compare using Java Streams
            if (Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}