
public class BTVN4 {

    /*
     * Tạo 1 mảng gồm tên của 5 hãng xe hơi,
     * sắp xếp mảng đó theo thứ tự alphabet (tham khảo phương thức compareTo)
     * Viết các TC để kiểm thử mảng đó
     */
    public String[] giaiBTVN4() {
        String arr[] = {"Vinfast", "Toyota", "Hyundai", "Mercedes", "BMW"};
        sortAlphabet(arr);
        printArr(arr);
        return arr;
    }

    public void printArr(String arr[]) {
        System.out.print("\nMảng sau khi sắp xếp là: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void sortAlphabet(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
