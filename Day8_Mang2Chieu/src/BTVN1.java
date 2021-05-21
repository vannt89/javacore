
import java.util.Scanner;

public class BTVN1 {

    /**
     * Viết chương trình nhập vào 1 ma trận vuông A, in ma trận đó ra màn hình
     * Liệt kê và tính tổng của các phần tử nằm trên đường chéo chính
     * Sắp xếp hàng 2 trong mảng theo chiều tăng dần
     **/

    public void giaiBTVN1() {
        System.out.println("\nBTVN 1: nhập vào 1 ma trận vuông A, in ma trận đó ra màn hình" +
                "\nLiệt kê và tính tổng của các phần tử nằm trên đường chéo chính" +
                "\nSắp xếp hàng 2 trong mảng theo chiều tăng dần");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của ma trận A: ");
        int line = scanner.nextInt();

        System.out.println("Nhập vào số cột của ma trận A: ");
        int column = scanner.nextInt();

        int[][] A = new int[line][column];

        System.out.println("Nhập vào các phần tử của ma trận A: ");
        for (int i = 0; i < line; i++) {
            System.out.println("Dòng " + (i + 1) + ": ");
            for (int j = 0; j < column; j++) {
                System.out.print("A [" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        // hiển thị ma trận A
        System.out.println("Ma trận A: ");
        Common.showArr(A, line, column);

        //Liệt kê và tính tổng các phần tử nằm trên đường chéo chính
        // các phần tử nằm trên đường chéo chính
        // là các phần tử có chỉ số dòng = chỉ số cột
        int sum = 0;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    System.out.print("\nPhần tử nằm trên đường chéo chính: " + A[i][j]);
                    sum += A[i][j];
                }
            }
        }
        System.out.println("\nTổng các phần tử nằm trên đường chéo chính = " + sum);

        //Sắp xếp hàng 2 trong mảng theo chiều tăng dần
        int lineSort = 1;
        Common.sortMaTranByASC(A, line, column, lineSort);
        System.out.println("\nMa trận A sau khi sắp xếp tăng dần hàng thứ " + (lineSort + 1) + " là: ");
        Common.showArr(A, line, column);
    }


}
