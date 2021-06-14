import java.util.ArrayList;
import java.util.List;

public class BTVN4 {

    /*
     * Tạo 1 mảng gồm tên của 5 hãng xe hơi,
     * sắp xếp mảng đó theo thứ tự alphabet (tham khảo phương thức compareTo)
     * Viết các TC để kiểm thử mảng đó
     */
    public List<String> giaiBTVN4() {
        List<String> list = new ArrayList<>();
        String arr[] = {"Vinfast", "Toyota", "Hyundai", "Mercedes", "BMW"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nMảng sau khi sắp xếp là: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);
        return list;
    }
}
