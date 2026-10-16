package Day6;

import java.util.*;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Number!");
        int userNumber = sc.nextInt();
        if (userNumber % 2 == 0) {
            System.out.println("you Number is Even");
        } else {
            System.out.println("you number is Odd");
        }
    }
}
