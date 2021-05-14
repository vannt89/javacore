public class ForLoop {

    void loopNumberReversed() {
        for (int i = 50; i >= 0; i--) {
            System.out.println("i-- = " + i);
        }
    }

    void tinhTongSoChan() {
        int sum = 0;
//        for (int i = 0; i <= 50; i += 2) {
//            System.out.println(i);
//            sum += i;
//
//        }
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn = " + sum);
    }

    void fizzBuzz() {
        ////C1
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("i = " + i + " - FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("i = " + i + " - Fizz");
            } else if (i % 5 == 0) {
                System.out.println("i = " + i + " - Buzz");
            } else {
                System.out.println("Số không chia hết cho 3 và 5, i = " + i);
            }

            ////C2
//            if (i % 3 == 0) {
//                if (i % 5 == 0) {
//                    System.out.println("FizzBuzz");
//                } else {
//                    System.out.println("Fizz");
//                }
//            } else {
//                if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(i);
//                }
//            }
        }
    }

}
