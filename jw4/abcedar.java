import java.util.Scanner;

public class abcedar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        String[] words = sc.next().split(","); 
        String result = ""; 

        for (int i = 0; i < n; i++) {
            String w = words[i].toLowerCase();
            int isAbc = 1; 
            
            for (int j = 0; j < w.length() - 1; j++) {
                if (w.charAt(j) > w.charAt(j + 1)) {
                    isAbc = 0; 
                    break;
                }
            }
            
            result += isAbc + (i < n - 1 ? "," : "");
        }
        
        System.out.println(result);
    }
}