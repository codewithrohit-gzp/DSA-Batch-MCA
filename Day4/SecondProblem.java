/*

Enter cost of 3 items form the user(useing flost datatype) 
a pencil,a pen and and eraser. you have to print the output
the total cost of the items back to the user as thier bill.


1. you also calculte the 18% gst to the items in the bill as an advance Problem
*/



package Day4;
import java.util.*;

public class SecondProblem {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("You bill is  :" + total);

        // Add gst -> with 18%
        float newTotal = total + (0.18f * total);
        System.out.println("Bill with GST 18% :"+newTotal);
    }
    
}
