import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        PrimeNumber primeNumber = new PrimeNumber();
        Fibonacci fibonacci = new Fibonacci();

        System.out.println("Bài 1 - Viết chương trình liệt kê n số nguyên tố đầu tiên");
        System.out.println("Bài 2 - Viết chương trình liệt kê các số nguyên tố nhỏ hơn 100");
        System.out.println("Bài 3 - Viết chương trình liệt kê n số fibonacci đầu tiên");
        System.out.println("Để thoát chương trình, nhập vào -1 nhé");

        int number = -1;
        do {
            System.out.print("\nBạn muốn giải bài tập số mấy?: ");
            number = scanner.nextInt();
            if (number != -1) {
                switch (number) {
                    case 1:
                        primeNumber.giaiBT1();
                        break;
                    case 2:
                        primeNumber.giaiBT2();
                        break;
                    case 3:
                        fibonacci.giaiBT3();
                        break;
                    default:
                        System.out.println("Không có bài tập này trong danh sách bài tập. Hãy chọn bài tập khác");
                        System.out.println("Để thoát chương trình, nhập vào -1 nhé");
                        break;
                }
            }
        } while (number >= 0);
    }
}
