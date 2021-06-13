import java.util.InputMismatchException;
import java.util.Scanner;

public class BTVN3 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        BTVN3 btvn3 = new BTVN3();
        btvn3.giaiBTVN3();
    }

    public void giaiBTVN3() {
        int numberOfStaff = 0;
        try {
            numberOfStaff = inputNumberOfStaff();
        } catch (InputNumberException ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }

        String arr[] = new String[numberOfStaff];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập mã nhân viên thứ " + i + ":");
            String id = scanner.nextLine();

            boolean check = id.matches("NV\\d{7}");
            while (!check) {
                System.out.println("Nhập sai rồi, vui lòng nhập lại : ");
                id = scanner.nextLine();
                check = id.matches("NV\\d{7}");
            }
            arr[i] = id;
        }

        System.out.println("\nMã nhân viên vừa nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }

    /*
     * Viết chương trình nhập vào 1 mảng gồm n phần tử,
     * mảng là các mã nhân viên có định dạng: NVxxxxx
     */
    public int inputNumberOfStaff() throws InputNumberException {
        int numberOfStaff = 0;
        try {
            System.out.println("Nhập vào số lượng nhân viên: ");
            numberOfStaff = Integer.parseInt(scanner.nextLine());
            if (numberOfStaff <= 0) throw new InputNumberException("Cần nhập số lớn hơn 0");
        } catch (InputMismatchException ex) {
            System.out.println("Hãy nhập vào 1 số" + ex.toString());
        }
        return numberOfStaff;
    }

}
