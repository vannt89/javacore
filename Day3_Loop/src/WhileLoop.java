public class WhileLoop {

    void getNumber() {
        int i = 0;
        while (i < 10) {
            System.out.println("i = " + i);
            i += 1;
        }
    }

    void loopReverser(int i) {
        while (i >= 0) {
            System.out.println("i = " + i);
            i--;
        }
    }

    void tinhTongSoChan() {
        int i = 0;
        int sum = 0;
//        while (i <= 50) {
//            if (i % 2 == 0) {
//                System.out.println("i =  " + i);
//                sum += i;
//            }
//            i++;
//        }
        while (i <= 50) {
            System.out.println("i = " + i);
            sum += i;
            i += 2;
        }
        System.out.println("sum = " + sum);
    }

}
