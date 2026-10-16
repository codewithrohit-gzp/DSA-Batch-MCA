package Project;
import java.util.*;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Income!");
        int income = sc.nextInt();
        double tax;

        if (income < 250000) {
            // tax =0%
            tax = 0;

        } else if (income <= 500000) {
            // tax =5%
            tax = (income - 250000) * 0.05;
        } else if (income <= 1000000) {
            // tax =20%
            tax = (250000 * 0.05) + (income - 500000) * 0.20;
        } else {
            // 30% Tax
            tax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30;
        }
        System.out.println("Your Income :"+income);
        System.out.println("tax :"+tax);
        System.out.println("Remaing Income After Tax:"+ (income-tax));
        

    }
}
