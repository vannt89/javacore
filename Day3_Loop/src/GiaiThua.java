import java.util.Scanner;

public class GiaiThua {

    /**
     * Định nghĩa : giai thừa của 1 số là tích các số liên tiếp từ 1 đến số đó.
     * Trường hợp đặc biệt, giai thừa của 0 và 1 là 1.
     * Ví dụ: giai thừa của 5 là 1*2*3*4*5 = 120
     */

    void giaiBT3() {
        System.out.println("\n\nBài 3 - Viết chương trình tính giai thừa, với n nhập vào từ bàn phím");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Giai thừa của " + n + " là: " + tinhGiaiThua(n));
    }

    long tinhGiaiThua(int n) {
        long giaiThua = 1;
        if (n == 0 || n == 1) {
            return giaiThua;
        } else {
            for (int i = 2; i <= n; i++) {
                giaiThua *= i;
            }
            return giaiThua;
        }
    }

}
