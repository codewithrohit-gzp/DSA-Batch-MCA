package Day4;
import java.util.*;

public class FirstProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperture in Celsius:");

        double cels = sc.nextDouble();
        double fah = (cels * 9 / 5) + 32;
        System.out.println("Temprate in Fahrenheit :"+ fah);
    }
}