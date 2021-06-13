import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class BTVN2 {

    final int MAX = 50;
    final int MIN = 10;

    public int getRandomNumber() {
        Random rd = new Random();
        int randomNumber = rd.nextInt((MAX - MIN) + 1) + MIN;
        System.out.println("Random number = " + randomNumber);
        return randomNumber;
    }

    public int inputNumber() throws InputNumberException {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean flag = false;
        while (!flag) {
            try {
                System.out.println("Nhập một số: ");
                number = Integer.valueOf(sc.nextLine());
                if (number < 10 || number > 50) throw new InputNumberException("Số cần trong khoảng 10->50");
                flag = true;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi NumberFormatException");
                flag = false;
            }
        }
        return number;
    }

    public void compareNumber() {
        int randomNumber = getRandomNumber();
        int input = 0;
        try {
            input = inputNumber();
        } catch (InputNumberException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

        if (randomNumber < input) {
            System.out.println("Số bạn đoán nhỏ hơn mất rồi");
        } else if (randomNumber == input) {
            System.out.println("Chúc mừng bạn đoán chính xác rồi");
        } else {
            System.out.println("Số bạn đoán lớn hơn mất rồi");
        }
    }

}
