import java.util.Random;

public class Bai4 {

    PrimeNumber primeNumber = new PrimeNumber();
    GiaiThua giaiThua = new GiaiThua();

    void giaiBT4() {
        System.out.println("Bài 4 - Viết chương trình tạo một số ngẫu nhiên, kiểm tra số đó có là số nguyên tố hay không? Tính giai thừa của số đó");
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        System.out.println("Random number = " + randomNumber);

        boolean isPrime = primeNumber.checkPrimeNumberWhileLoop(randomNumber);
        if (isPrime) {
            System.out.println("Đây là số nguyên tố");
        } else {
            System.out.println("Đây không phải là số nguyên tố");
        }
        long result = giaiThua.tinhGiaiThua(randomNumber);
        System.out.println("Giao thừa của " + randomNumber + " là: " + result);
    }
}
