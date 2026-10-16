import java.util.*;

public class findNumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive Number!");
        int n = sc.nextInt();
        boolean isPrime = true;
        if (n == 2) {
            System.out.println("Prime Number");
        } else {
            for (int i = 2; i <= n - 1; i++) {
                // check
                if (n % i == 0) {
                    isPrime = false;
                }
            }
        }

        if (isPrime == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }
    }
}