
import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

public class Common {

    static void showArr(int[][] arr, int dong, int cot) {
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void sortMaTranByASC(int[][] maTran, int line, int column, int lineSort) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (i == lineSort) {
                    sortASC(maTran[i]);
                }
            }
        }
    }

    public static void sortASC(int[] intArr) {
        int temp = intArr[0];
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
            }
        }
    }

    //số nguyên tố là số chia hết cho 1 và chính nó
    static boolean checkPrimeNumberForLoop(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void sortMaTranByASCAllLine(int[][] maTran, int line, int column, int lineSort) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column - 1; j++) {
                for (int k = column - 1; k > j; k--) {
                    if (maTran[i][k] < maTran[i][k - 1]) {
                        int temp = maTran[i][k];
                        maTran[i][k] = maTran[i][k - 1];
                        maTran[i][k - 1] = temp;
                    }
                }

            }
        }
    }

    static void sortMaTranByDESCAllLine(int[][] maTran, int line, int column, int lineSort) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column - 1; j++) {
                for (int k = column - 1; k > j; k--) {
                    if (maTran[i][k] > maTran[i][k - 1]) {
                        int temp = maTran[i][k];
                        maTran[i][k] = maTran[i][k - 1];
                        maTran[i][k - 1] = temp;
                    }
                }

            }
        }
    }

}
