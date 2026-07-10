import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        long reversed = 0;
        
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        
        System.out.println(reversed);
        
        sc.close();
    }
}