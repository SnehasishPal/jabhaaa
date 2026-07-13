import java.util.Scanner;

public class Main2 {
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        
        int digits = String.valueOf(n).length();
        int divisor = (int) Math.pow(10, digits - 1);
        boolean isCircular = true;
        
        for (int i = 0; i < digits; i++) {
            if (!isPrime(temp)) {
                isCircular = false;
                break;
            }
            int leftmost = temp / divisor;
            int remaining = temp % divisor;
            temp = remaining * 10 + leftmost;
        }
        
        if (isCircular) {
            System.out.println(n + " is a circular prime");
        } else {
            System.out.println(n + " is not a circular prime");
        }
        
        sc.close();
    }
}