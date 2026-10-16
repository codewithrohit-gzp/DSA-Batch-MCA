import java.util.*;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {

        // do while
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter Your positive Integer");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            // Check Even Or odd
            if (number % 2 == 0) {
                // System.out.println("Even");
                evenSum = evenSum + number; // evenSum +=number //sum of Even Number
            } else {
                oddSum = oddSum + number; // oddSum +=number
            }

            System.out.println("Do you want to cont..if yes then press 1 or 0");
            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("EvenSum :" + evenSum);
        System.out.println("OddSum :" + oddSum);

    }
}