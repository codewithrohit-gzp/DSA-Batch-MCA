package Day11;

public class ReverseGivenNumber {
    public static void main(String[] args) {
        int n = 27072002;
        int rev =0;
        while (n > 0) {
            int ld = n % 10;
            rev = (rev * 10) + ld;
            n = n / 10;
        }
        System.out.println(rev);

    }
}
