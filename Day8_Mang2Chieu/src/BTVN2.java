import java.util.Scanner;

public class BTVN2 {
    Scanner scanner = new Scanner(System.in);

    public void giaiBTVN2() {
        System.out.println("--------------------------------------------");
        System.out.println("\nBTVN 2: nhập vào 1 mảng số nguyên gồm n phần tử" +
                "\nLiệt kê và tính tổng của các phần tử là số nguyên tố" +
                "\nNhập vị trí k và sửa phần tử tại vị trí đó");

        System.out.println("Nhập vào số phần tử của mảng: ");
        int size = scanner.nextInt();

        int intArr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử thứ " + i + ": ");
            intArr[i] = scanner.nextInt();
        }

        System.out.println("\nMảng vừa nhập là: ");
        for (int i = 0; i < size; i++) {
            System.out.print(intArr[i] + "\t");
        }

        //Liệt kê các phần tử là số nguyên tố và tính tổng các phần tử đó
        System.out.println("\nCác số nguyên tố trong mảng là: ");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (Common.checkPrimeNumberForLoop(intArr[i])) {
                System.out.print(intArr[i] + "\t");
                sum += intArr[i];
            }
        }
        System.out.println("\nTổng của các số nguyên tố trong mảng là: " + sum);

        //Nhập vị trí k và sửa phần tử tại vị trí đó
        System.out.println("\nNhập vào vị trí k: ");
        int k = scanner.nextInt();

        int newK = 0;
        boolean isExit = inputIndexKAndEdit(intArr, k, newK);

        if (isExit) {
            System.out.println("Mảng sau khi chỉnh sửa k là: ");
            for (int i = 0; i < size; i++) {
                System.out.print(intArr[i] + "\t");
            }
        }

    }

    public boolean inputIndexKAndEdit(int arr[], int k, int newNumber) {
        boolean isExit = false;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == arr[k]) {
                    isExit = true;
                    System.out.println("Vị trí của k hiện tại đang có giá trị là: " + arr[i]);
                    System.out.println("Bạn muốn sửa thành số mấy: ");
                    newNumber = scanner.nextInt();
                    arr[i] = newNumber;
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Vị trí k bạn vừa nhập không hợp lệ");
            System.out.println("Hãy nhập vị trí k trong khoảng từ 0 tới " + (arr.length - 1));
        }
        return isExit;
    }

}
