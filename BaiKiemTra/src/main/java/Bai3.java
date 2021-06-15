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

    public int inputNumber() throws InputNumberException {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean flag = false;
        while (!flag) {
            try {
                System.out.println("Nhập một số: ");
                number = Integer.valueOf(sc.nextLine());
                if (number <= 0 || number > 12) throw new InputNumberException("Số cần trong khoảng 1-> 12");
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Hãy nhập vào 1 số. Nhập lại nhé");
                flag = false;
            }
        }
        return number;
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
                break;
        }
    }
}
