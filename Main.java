import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long sum = 0;
            
            for (long i = 1; i * i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                    
                    if (i != n / i) {
                        sum += n / i;
                    }
                }
            }
            
            System.out.println(sum);
        }
        
        sc.close();
    }
}