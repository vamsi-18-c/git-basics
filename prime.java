import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }

    static boolean isPrime(long n) {

        // Step 1: handle small cases
        if (n <= 1) return false;
        if (n <= 3) return true;

        // Step 2: eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) return false;    // checking if divisible by 2 or 3

        // Step 3: check only 6k±1 numbers
        for (long i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }

        return true;
    }
}