package Day11;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int n = 2057;
        int rev = 0;
        while (n > 0) {
            // lastdigit 
            int ld = n % 10;
            // formula -->rev=rev*10 +ld
            rev = (rev * 10) + ld;
            // Remove 
            n = n / 10;

        }
        System.out.println("Reverse :"+rev);
    }
}
