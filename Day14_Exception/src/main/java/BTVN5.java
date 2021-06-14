import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BTVN5 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        BTVN5 btvn5 = new BTVN5();
        btvn5.giaiBTVN5();
    }

    /*
     * Tạo 1 mảng gồm n phần tử là tên của mọi người trong lớp,
     * tên không được chứa số, chuẩn hoá tên của mọi người
     * sắp xếp tên của mọi người theo thứ tự alphabet
     */
    public void giaiBTVN5() {
        BTVN5 btvn5 = new BTVN5();
        int numberOfStudent = 0;
        try {
            numberOfStudent = inputNumberOfStudent();
        } catch (InputNumberException ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }

        String arr[] = new String[numberOfStudent];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập tên sinh viên thứ " + i + ":");
            arr[i] = scanner.nextLine();
            while (btvn5.checkIfContainDigits(arr[i])) {
                System.out.println("Hãy nhập lại tên: ");
                arr[i] = scanner.nextLine();
            }
            if (!btvn5.checkIfContainDigits(arr[i])) {
                arr[i] = btvn5.capsFirstLetter(arr[i]);
            }
        }

        System.out.println("\nTên sinh viên vừa nhập là: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
        btvn5.sortNameAlphabet(arr);
    }

    public void sortNameAlphabet(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp là: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public int inputNumberOfStudent() throws InputNumberException {
        int numberOfStudent = 0;
        try {
            System.out.println("Nhập vào số lượng sinh viên: ");
            numberOfStudent = Integer.parseInt(scanner.nextLine());
            if (numberOfStudent <= 0) throw new InputNumberException("Cần nhập số lớn hơn 0");
        } catch (NumberFormatException ex) {
            throw new InputNumberException("Hãy nhập vào 1 số");
        }
        return numberOfStudent;
    }

    public boolean checkIfContainDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println("-> Error: Tên ko dc chứa chữ số");
                return true;
            }
        }
        return false;
    }

    public String capsFirstLetter(String input) {
        StringBuilder output = new StringBuilder();
        String[] strArr = input.trim().split("\\s+");
        if (strArr.length >= 2) {
            for (String str : strArr) {
                String firstChar = String.valueOf(str.charAt(0));
                output.append(firstChar.toUpperCase() + str.substring(1).toLowerCase());
                output.append(" ");
            }
        } else {
            System.out.println("Hãy nhập đầy đủ họ và tên");
        }
        return output.toString().trim();
    }
}
