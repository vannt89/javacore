import java.util.Scanner;

public class Bai3 {
    Scanner scanner = new Scanner(System.in);

    /*
     *Viết chương trình nhập vào một số nguyên dương,
     * kiểm tra số đó có là một tháng trong năm không.
     * Nếu có thì in ra tháng đó có bao nhiêu ngày. (Xử lý exception đầy đủ)
     */
    public void giaiBKT3() {
        Bai3 bai3 = new Bai3();
        int number = 0;
        try {
            number = bai3.inputNumber();
        } catch (InputNumberException ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }

        bai3.showDatesOfMonth(number);
    }

    public void showDatesOfMonth(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                System.out.println("Tháng " + month + " có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng " + month + " có 28 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + " có 30 ngày");
                break;
            default:
                System.out.println("Nhập tháng sai rồi. Hãy nhập tháng trong phạm vi từ 1-12");
                break;
        }
    }

    public int inputNumber() throws InputNumberException {
        int number = 0;
        try {
            System.out.println("Nhập vào 1 số: ");
            number = Integer.parseInt(scanner.nextLine());
            if (number <= 0) throw new InputNumberException("Cần nhập số lớn hơn 0");
        } catch (NumberFormatException ex) {
            System.out.println("Hãy nhập vào 1 số" + ex.toString());
        }
        return number;
    }
}
