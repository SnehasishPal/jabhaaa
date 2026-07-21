import java.util.Scanner;

class sa2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), arr[] = new int[n];
        
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();
        
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j]) { 
                    int t = arr[i]; arr[i] = arr[j]; arr[j] = t; 
                }
                
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + (i < n - 1 ? " " : ""));
    }
}