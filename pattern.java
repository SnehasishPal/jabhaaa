public class pattern{
    public static void main(String[] args) {
        int n = 8; 

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
            }

            if (i < n) {
                int numSpaces = 4 * n - 4 * i - 1;
                for (int s = 0; s < numSpaces; s++) {
                    System.out.print(" ");
                }
            }

            int start = (i == n) ? i - 1 : i; 
            
            if (i == n) {
                System.out.print(" ");
            }

            for (int j = start; j >= 1; j--) {
                System.out.print(j);
                if (j > 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}