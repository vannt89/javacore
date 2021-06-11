import java.util.Scanner;

public class BTVN2 {

    /*
     * 2 - Viết chương trình cho phép người dùng nhập vào mã số nhân viên
     * Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
     * Định dạng mã số sinh viên là “NVxxxxxxx” với x là số nguyên từ 1-9. (Gợi ý, sử dụng regex)
     */

    public String giaiBTVN2(String input) {
        String regex = "NV\\d{7}";
        if (!input.matches(regex)) {
            return "Mã nhân viên không hợp lệ";
        }
        return input;
    }
}
