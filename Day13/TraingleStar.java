import java.util.Scanner;

public class TraingleStar {
    public static void main(String[] args) {

        // *
        // * *
        // * * *
        // * * * *

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number!");
        int num = sc.nextInt();

        for (int line = 1; line <= num; line++) {
            for (int s = 1; s <= line; s++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
