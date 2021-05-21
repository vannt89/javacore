import java.util.Scanner;

public class B1_MaTran {

    /**
     * Viết chương trình nhập vào 2 ma trận vuông A và B, in 2 ma trận đó ra màn hình
     * Tính tổng của 2 ma trận A và B
     * Tìm ma trận chuyển vị của 2 ma trận đó
     **/

    public static void main(String args[]) {
        int m1, n1; // số dòng và số cột của ma trận A
        int m2, n2; // số dòng và số cột của ma trận B

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của ma trận A: ");
        m1 = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận A: ");
        n1 = scanner.nextInt();

        System.out.println("Nhập vào số dòng của ma trận B: ");
        m2 = scanner.nextInt();
        System.out.println("Nhập vào số cột của ma trận B: ");
        n2 = scanner.nextInt();


        int[][] A = new int[m1][n1];
        int[][] B = new int[m2][n2];

        // ma trận C = A + B
        int C[][] = new int[m1][n2];

        System.out.println("Nhập vào các phần tử của ma trận A: ");
        for (int i = 0; i < m1; i++) {
            System.out.println("Dòng " + (i + 1) + ": ");
            for (int j = 0; j < n1; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Nhập vào các phần tử của ma trận B: ");
        for (int i = 0; i < m2; i++) {
            System.out.println("Dòng " + (i + 1) + ": ");
            for (int j = 0; j < n2; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
        }

        // hiển thị 2 ma trận vừa nhập
        System.out.println("Ma trận A: ");
        Common.showArr(A, m1, n1);

        System.out.println("Ma trận B: ");
        Common.showArr(B, m2, n2);

        // tính và in ra ma trận C = A + B
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // hiển thị ma trận C
        System.out.println("Ma trận C: ");
        Common.showArr(C, m1, n2);

        // tìm ma trận D là ma trận chuyển vị của ma trận C
        // ma trận D là ma trận chuyển vị của ma trận C
        // thì các dòng của ma trận C sẽ trở thành
        // các cột của ma trận D và ngược lại
        // ví dụ: ma trận C có số dòng m1 = 3 và số cột n2 = 4 thì
        // ma trận D sẽ có số dòng n2 = 4 và số cột m1 = 3
        int D[][] = new int[n2][m1];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n2; j++) {
                D[j][i] = C[i][j];
            }
        }

        // hiển thị ma trận D
        System.out.println("Ma trận chuyển vị của ma trận C là: ");
        Common.showArr(D, n2, m1);

    }

}
