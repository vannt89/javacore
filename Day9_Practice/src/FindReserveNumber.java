public class FindReserveNumber {

    /**
     * Bài 4 - Nhập vào số nguyên dương n (n > 0) từ cửa sổ màn hình console.
     * Tìm chữ số đảo ngược của số nguyên n
     * Ví dụ: n = 1058 => 8501
     *
     * @param number
     */

    public void findReserveNumber(int number) {
        int reversed = 0;
        while (number != 0) {

            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }

}
