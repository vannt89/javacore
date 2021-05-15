public class BangCuuChuong {

    public void giaiBT6() {
        System.out.println("\n\nBài 6 - Viết chương trình in ra bảng cửu chương");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + "*" + j + "=" + result);
            }
            System.out.println("---Hết dãy số " + i + "---");
        }
    }

}
