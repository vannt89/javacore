import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        PrimeNumber primeNumber = new PrimeNumber();
        Fibonacci fibonacci = new Fibonacci();
        GiaiThua giaiThua = new GiaiThua();
        Bai4 bai4 = new Bai4();
        Bai5 bai5 = new Bai5();
        BangCuuChuong bangCuuChuong = new BangCuuChuong();
        CheckTriangle triangle = new CheckTriangle();
        Bai8 bai8 = new Bai8();
        Bai15 bai15 = new Bai15();
        Utils.mainMenu();

        int number = 0;
        do {
            System.out.print("\nBạn muốn giải bài tập số mấy?: ");
            number = scanner.nextInt();
            switch (number) {
                case 0:
                    System.out.print("Thank You! Have Fun!");
                    System.exit(0);
                    break;
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
                case 6:
                    bangCuuChuong.giaiBT6();
                    break;
                case 7:
                    triangle.giaiBT7();
                    break;
                case 8:
                    bai8.giaiBT8();
                    break;
                case 15:
                    bai15.giaiBT15();
                    break;
                default:
                    System.out.println("Không có bài tập này trong danh sách bài tập. Hãy chọn bài tập khác");
                    System.out.println("Để thoát chương trình, nhập vào 0 nhé");
                    break;
            }
        } while (number > 0);
    }
}
