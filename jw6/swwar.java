import java.util.Scanner;

public class swwar {
    // Condensed prime check
    static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) return;
        
        int size = s.nextInt(), count = 0;
        int[] arr = new int[size];
        
        // Read and process in the same loop
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
            if (isPrime(i) && arr[i] % i == 0) {
                arr[i] = i;
                count++;
            }
        }
        
        System.out.println(count);
        
        // Print array using a ternary operator for the spaces
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + (i < size - 1 ? " " : "\n"));
        }
        
        s.close();
    }
}