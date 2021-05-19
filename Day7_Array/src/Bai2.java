import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {

    public static final String KITU_JAVA = "Java";

    public void giaiBT2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int size = Integer.valueOf(scanner.nextLine());

        String strArr[] = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            strArr[i] = scanner.nextLine();
        }

        System.out.println("\nMảng vừa nhập là: " + Arrays.toString(strArr));

        //Đếm số lần "Java" xuất hiện trong mảng
        countWords(strArr);

        String str = "";
        System.out.println("Nhập vào chuỗi bất kì: ");
        str = scanner.nextLine();
        getIndexOfStr(strArr, str);
    }

    void getIndexOfStr(String[] strArr, String str) {
        boolean isExit = false;
        int index = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equalsIgnoreCase(str)) {
                isExit = true;
                index = i;
            }
        }
        if (isExit) {
            System.out.println("Chuỗi " + str + " có index thứ " + index + " trong mảng " + Arrays.toString(strArr));
        } else {
            System.out.println("Chuỗi " + str + " không tồn tại trong mảng " + Arrays.toString(strArr));
        }
    }

    void countWords(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(KITU_JAVA)) {
                count++;
            }
        }
        System.out.println("\nSố lần ký tự " + KITU_JAVA + " xuất hiện trong mảng = " + count);
    }

}
