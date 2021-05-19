import java.util.Scanner;

public class Bai1 {

    public void giaiBT1() {
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
        }

        //Tìm phần tử lớn nhất và lớn thứ hai, show index của phần tử đó
        getMaxLargestValueAndSecondLargestValue(intArr);

        //Tìm phần tử nhỏ nhất và index của phần tử đó
        getMinNumberAndIndex(intArr);
    }

    void getMaxLargestValueAndSecondLargestValue(int array[]) {
        int maxLargestNumber = 0;
        int secondLargest = 0;
        if (array.length < 2) {
            System.out.println("\nHãy nhập mảng có nhiều hơn 1 phần tử ");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxLargestNumber) {
                secondLargest = maxLargestNumber;
                maxLargestNumber = array[i];
            } else if (array[i] > secondLargest && array[i] != maxLargestNumber) {
                secondLargest = array[i];
            }
        }
        System.out.println("\nPhần tử lớn nhất trong mảng là: " + maxLargestNumber);
        getIndexOfNumber(array, maxLargestNumber);

        System.out.println("\nPhần tử lớn thứ hai trong mảng là: " + secondLargest);
        getIndexOfNumber(array, secondLargest);
    }

    void getIndexOfNumber(int array[], int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println("Index của phần tử là: " + i);
            }
        }
    }

    void getMinNumberAndIndex(int array[]) {
        int minNumber = array[0];
        if (array.length < 2) {
            System.out.println("Hãy nhập mảng có nhiều hơn 1 phần tử ");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (minNumber > array[i]) {
                minNumber = array[i];
            }
        }
        System.out.println("\nPhần tử nhỏ nhất trong mảng là: " + minNumber);
        getIndexOfNumber(array, minNumber);
    }
}
