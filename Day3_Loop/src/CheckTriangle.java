import java.util.Scanner;

public class CheckTriangle {

    public void giaiBT7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        double canha = scanner.nextDouble();
        System.out.println("Nhập cạnh b: ");
        double canhb = scanner.nextDouble();
        System.out.println("Nhập cạnh c: ");
        double canhc = scanner.nextDouble();

        checkTriangle(canha, canhb, canhc);
    }

    public void checkTriangle(double a, double b, double c) {
        if ((a + b > c) || (a + c > b) || (b + c > a)) {
            if ((a == b) && (b == c)) {
                System.out.println("Đây là tam giác đều");
            } else if ((a == b) || (b == c) || (c == a)) {
                System.out.println("Đây là tam giác cân");
            } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
                System.out.println("Đây là tam giác vuông");
            } else {
                System.out.println("Đây là tam giác thường");
            }
        } else {
            System.out.println("Đây không phải tam giác");
        }
    }
}
