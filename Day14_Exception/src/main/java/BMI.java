import java.util.InputMismatchException;
import java.util.Scanner;

public class BMI {

    public static void main(String args[]) {
        double a, b;
        double result;
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter height: ");
            a = input.nextDouble();

            System.out.println("Enter weight: ");
            b = input.nextDouble();

            result = a / b * b;
        } catch (InputMismatchException ex) {
            System.out.println("Please enter a number");
        }
    }

}
