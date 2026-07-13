import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        
        // 1. Check if the number is negative
        boolean isNegative = n < 0;
        
        // 2. Work with the absolute value
        int temp = Math.abs(n);
        long reversed = 0;
        
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        
        // 3. Reapply the sign if necessary
        if (isNegative) {
            reversed = -reversed;
        }
        
        System.out.println(reversed);
        
        sc.close();
    }
}