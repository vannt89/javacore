import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        PrimeNumber primeNumber = new PrimeNumber();
        Fibonacci fibonacci = new Fibonacci();
        GiaiThua giaiThua = new GiaiThua();
        Bai4 bai4 = new Bai4();
        Bai5 bai5 = new Bai5();

        System.out.println("Bài 1 - Viết chương trình liệt kê n số nguyên tố đầu tiên && các số nguyên tố nhỏ hơn 100");
        System.out.println("Bài 2 - Viết chương trình liệt kê n số fibonacci đầu tiên && các số Fibonacci nhỏ hơn 100");
        System.out.println("Bài 3 - Viết chương trình tính giai thừa, với n nhập vào từ bàn phím");
        System.out.println("Bài 4 - Viết chương trình tạo một số ngẫu nhiên, kiểm tra số đó có là số nguyên tố hay không? Tính giai thừa của số đó");
        System.out.println("Bài 5 - Viết chương trình in ra màn hình index của tất cả ký tự ‘o’ trong 1 chuỗi");
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
                        fibonacci.giaiBT2();
                        break;
                    case 3:
                        giaiThua.giaiBT3();
                        break;
                    case 4:
                        bai4.giaiBT4();
                        break;
                    case 5:
                        bai5.giaiBT5();
                        break;
                    default:
                        System.out.println("Không có bài tập này trong danh sách bài tập. Hãy chọn bài tập khác");
                        System.out.println("Để thoát chương trình, nhập vào -1 nhé");
                        break;
                }
            }
        } while (number >= 0);
        System.out.print("Thank You! Have Fun!");
    }
}
