import java.util.Scanner;

public class NOOMBZ {
    // Arrays for base words
    static String[] o = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    static String[] t = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    // Recursive function to build the word string
    static String toWords(int n) {
        if (n < 20) return o[n];
        if (n < 100) return t[n / 10] + (n % 10 > 0 ? " " + o[n % 10] : "");
        if (n < 1000) return o[n / 100] + " hundred" + (n % 100 > 0 ? " " + toWords(n % 100) : "");
        return toWords(n / 1000) + " thousand" + (n % 1000 > 0 ? " " + toWords(n % 1000) : "");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int n = s.nextInt();
            // Handle 0 explicitly, otherwise process the number
            System.out.println(n == 0 ? "zero" : toWords(n));
        }
        s.close();
    }
}