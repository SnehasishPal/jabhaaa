import java.util.Scanner;

public class keypad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Safety 1: Prevent crash if the platform feeds a completely blank test case
        if (!sc.hasNext()) 
            return; 
        
        // Safety 2: Force uppercase and strip hidden spaces just in case
        String str = sc.next().trim().toUpperCase(); 
        
        int[] pad = {2,2,2, 3,3,3, 4,4,4, 5,5,5, 6,6,6, 7,7,7,7, 8,8,8, 9,9,9,9};
        String result = "";
        
        for (char c : str.toCharArray()) {
            // Safety 3: Only apply the math if it is strictly a letter between A and Z
            if (c >= 'A' && c <= 'Z') {
                result += pad[c - 'A'];
            }
        }
        
        System.out.println(result);
        sc.close();
    }
}