public class SumCalculator {

    /**
     * B1 - Nhập vào số nguyên dương n (n > 0) từ cửa sổ màn hình console.
     * Sau đó, tính tổng S(n) = 1^2 + 2^2 +…+ n^2
     * @param number
     * @return
     */
    public int sumSquared(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i * i;
        }
        return sum;
    }

    /**
     * Bài 2 - Nhập vào số nguyên dương n (n > 0) từ cửa sổ màn hình console.
     * Sau đó, tính tổng S(n) = 1 + 1/2 + 1/3 +…+ 1/n
     * @param number
     * @return
     */
    public float sumFraction(int number) {
        float sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += 1.0 / i;  //sum = sum + 1/i
        }

        return sum;
    }

    /**
     * Bài 3 - Nhập vào số nguyên dương n (n >= 0) từ cửa sổ màn hình console.
     * Sau đó, tính tổng S(n) = 1/2 + 3/4 + 5/6 +…+ (2n+1)(2n+2)(n>=0)
     * @param number
     * @return
     */
    public float sumB3(int number) {
        float sum = 0;
        for (int i = 0; i <= number; i++) {
            float result = ((2 * (float) i) + 1) / ((2 * (float) i) + 2);
            sum += result;  //sum = sum + (2n+1)(2n+2)
        }
        return sum;
    }

}
