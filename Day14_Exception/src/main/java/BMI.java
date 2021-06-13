import java.util.InputMismatchException;
import java.util.Scanner;

public class BMI {

    ////BTVN1
    public void giaiBTVN1() {
        double bmi = calBMI();
        if (bmi < 18.5) {
            System.out.println("Thiếu cân");
        } else if (bmi >= 18.5 && bmi < 20) {
            System.out.println("Cân đối");
        } else {
            System.out.println("Thừa cân");
        }
    }

    public double calBMI() {
        double a = 0;
        double b = 0;
        double result = 0;
        Scanner input = new Scanner(System.in);
        try {
            do {
                System.out.println("Nhập vào chiều cao: ");
                a = input.nextDouble();
            } while (a <= 0);
        } catch (InputMismatchException ex1) {
            System.out.println("Hãy nhập chiều cao là 1 số");
            System.exit(0);
        }

        try {
            do {
                System.out.println("Nhập vào cân nặng: ");
                b = input.nextDouble();
            } while (b <= 0);
        } catch (InputMismatchException ex1) {
            System.out.println("Hãy nhập cân nặng là 1 số");
            System.exit(0);
        }

        result = a / b * b;
        System.out.println("BMI = " + result);

        return result;
    }


}
