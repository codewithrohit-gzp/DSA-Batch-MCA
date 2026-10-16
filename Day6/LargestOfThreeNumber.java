package Day6;

public class LargestOfThreeNumber {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 3;

        if (a > b && a > c) {
            System.out.println("A is the Largest Number");
        } else if (b > c) {
            System.out.println("B Is the Largest Number");
        } else {
            System.out.println("C is the Largest Number");
        }
    }
}
