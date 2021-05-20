import java.util.Scanner;

public class B2_MangDaChieu {

    /**
     * Viết chương trình nhập vào 1 mảng đa chiều, in mảng đó ra màn hình.
     * Tính tổng các phần tử chia hết cho 5 trong mảng đó.
     **/

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng: ");
        int line = scanner.nextInt();
        System.out.println("Nhập vào số cột: ");
        int column = scanner.nextInt();

        int[][] arr = new int[line][column];

        System.out.println("Nhập vào các phần tử của mảng: ");
        for (int i = 0; i < line; i++) {
            System.out.println("Dòng " + (i + 1) + ": ");
            for (int j = 0; j < column; j++) {
                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = scanner.nextInt();
            }
        }

        // hiển thị mảng vừa nhập
        System.out.println("Hiển thị mảng vừa nhập: ");
        showArr(arr, line, column);

        int sum = 0;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] % 5 == 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum = " + sum);
    }

    static void showArr(int[][] arr, int dong, int cot) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
