import java.util.Scanner;

public class CrazyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Check if there's input to read
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            // Loop through each test case
            for (int i = 0; i < t; i++) {
                long n = scanner.nextLong();
                
                if (isCrazy(n)) {
                    System.out.println(n + " is a crazy number");
                } else {
                    System.out.println(n + " is not a crazy number");
                }
            }
        }
        scanner.close();
    }

    // Method to check if a number is a "Crazy Number"
    public static boolean isCrazy(long num) {
        // Convert to string simply to find the number of digits easily
        int length = String.valueOf(num).length();
        long sum = 0;
        long temp = num;

        // Extract digits and calculate the sum of (digit ^ length)
        while (temp > 0) {
            long digit = temp % 10;
            sum += power(digit, length);
            temp /= 10; // Remove the last digit
        }

        // If the calculated sum matches the original number, it's crazy
        return sum == num;
    }

    // Custom power function to avoid double precision loss from Math.pow()
    private static long power(long base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
}