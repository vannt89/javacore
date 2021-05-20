import java.util.Arrays;
import java.util.Scanner;

public class ArrayInJava {

    public static void main(String args[]) {
//        stringArray();
//        doubleArray();
//        floatArray();
        intArray();
    }

    public static void intArray() {
        int sum = 0;
        int sumOfEvenNumber = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int size = scanner.nextInt();

        int intArr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            intArr[i] = scanner.nextInt();
        }

        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < size; i++) {
            System.out.print(intArr[i] + "\t");
            sum += intArr[i];
            if (intArr[i] % 2 == 0) {
                sumOfEvenNumber += intArr[i];
            }
        }
        System.out.println("\nSố phần tử trong mảng là: " + intArr.length);
        System.out.println("Phần tử tại vị trí index = 2 là: " + intArr[2]);
        System.out.println("Tổng của các phần tử trong mảng là: " + sum);
        System.out.println("Tổng của các số chẵn là: " + sumOfEvenNumber);

        sortDESC(intArr);
        System.out.println("\nKết quả sau khi sắp xếp theo thứ tự giảm dần là: ");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + "\t");
        }

        sortASC(intArr);
        System.out.println("\nKết quả sau khi sắp xếp theo thứ tự tăng dần là: ");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + "\t");
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

    public static void sortDESC(int[] intArr) {
        int temp = intArr[0];
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] < intArr[j]) {
                    temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
            }
        }
    }

    public static void stringArray() {
//        String stringArr[] = new String[5];
//        stringArr[0] = "An Nhien 1";
//        stringArr[1] = "An Nhien 2";
//        stringArr[2] = "An Nhien 3";
//        stringArr[3] = "An Nhien 4";
        String stringArr[] = {"An Nhien 1", "An Nhien 2", "An Nhien 3", "An Nhien 4", "An Nhien 5"};

        for (int i = 0; i < stringArr.length; i++) {
            System.out.println("Phần tử thứ " + i + " là: " + stringArr[i]);
        }
    }

    public static void floatArray() {
        Float floatArr[] = {0.1f, 0.2f, 0.3f};
        for (int i = 0; i < floatArr.length; i++) {
            System.out.println("Phần tử thứ " + i + " là: " + floatArr[i]);
        }
    }

    public static void doubleArray() {
        Double doubleArr[] = new Double[3];
        doubleArr[0] = 5.5;
        doubleArr[1] = 5.6;
        doubleArr[2] = 5.7;

        for (int i = 0; i < doubleArr.length; i++) {
            System.out.printf("Phần tử thứ %d: %s\n", i, doubleArr[i]);
        }
    }

    public void sortForLoop() {
        int[] my_array = {6, 7, 3, 3, 4, 5};
        for (int i = 0; i < my_array.length; ) {
            // Nếu số trước nhỏ hơn số sau thì đổi vị trí, và duyệt lại từ đầu
            if (my_array[i] > my_array[i + 1]) {
                int temp = my_array[i + 1];
                my_array[i + 1] = my_array[i];
                my_array[i] = temp;
                i = 0; //duyệt lại
            } else {
                // Nếu vị trí của i gần cuối thì break, ko loop nữa.
                if (i >= my_array.length - 2)
                    break;
                else
                    i++;
            }
        }
        System.out.printf("Mảng sau khi sắp xếp my_array[] : %s", Arrays.toString(my_array));
    }

    public void sortWhileLoop() {
        int[] my_array = {6, 7, 3, 3, 4, 5, 3};

        int i = 0;
        while (true) {
            // Nếu số trước nhỏ hơn số sau thì đổi vị trí, và duyệt lại từ đầu
            if (my_array[i] > my_array[i + 1]) {
                int temp = my_array[i + 1];
                my_array[i + 1] = my_array[i];
                my_array[i] = temp;
                i = 0; //duyệt lại
            } else {
                // Nếu vị trí của i gần cuối thì break, ko loop nữa.
                if (i >= my_array.length - 2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        //In kết quả
        System.out.printf("Mảng sau khi sắp xếp my_array[] : %s", Arrays.toString(my_array));
    }
}
