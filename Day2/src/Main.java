import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
//        calculate BMI
//        System.out.println("Nhập chiều cao: ");
//        double chieucao = scanner.nextDouble();
//        System.out.println("Chiều cao là: " + chieucao);
//
//        System.out.println("Nhập cân nặng: ");
//        double cannang = scanner.nextDouble();
//        System.out.println("Cân nặng là: " + cannang);
//
//        BMI bmi = new BMI();
//        bmi.calculateBMI(chieucao, cannang);

        ////homework day2
        ////B1
//        System.out.println("*****Bài 1 - Nhập vào 1 tháng bất kì và in ra số ngày trong tháng đó*****");
//        System.out.println("Enter month: ");
//        int month = scanner.nextInt();
//
//        Month m = new Month();
//        m.showDatesOfMonth(month);
//        m.getDatesInMonth(month);

        ////B2
        System.out.println("\n*****Bài 2 - Giải phương trình bậc 2*****");
        System.out.println("Enter a: ");
        float a = scanner.nextFloat();

        System.out.println("Enter b: ");
        float b = scanner.nextFloat();

        System.out.println("Enter c: ");
        float c = scanner.nextFloat();

        GiaiPTBac2 ptb2 = new GiaiPTBac2();
        ptb2.tinhNghiemPTB2(a, b, c);

        ////B3
//        System.out.println("\n*****Bài 3 - Kiếm tra 3 số nhập vào có phải là 1 tam giác hay không*****");
//        System.out.println("Enter a: ");
//        float a1 = scanner.nextFloat();
//
//        System.out.println("Enter b: ");
//        float b1 = scanner.nextFloat();
//
//        System.out.println("Enter c: ");
//        float c1 = scanner.nextFloat();
//
//        Triangle triangle = new Triangle();
//        triangle.checkTriangle(a1, b1, c1);
    }

}
