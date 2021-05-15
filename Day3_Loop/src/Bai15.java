public class Bai15 {
    public static final char KITU_O = 'o';

    void giaiBT15() {
        System.out.println("\n\nBài 15 - Viết chương trình đếm số lần ký tự ‘o’ xuất hiện trong chuỗi: “You only live once, but if you do it right, once is enough”");
        String chars = "You only live once, but if you do it right, once is enough";
        countCharDoWhileLoop(chars);
    }

    void countCharForLoop(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char kitu = input.charAt(i);
            if (kitu == KITU_O) {
                count++;
            }
        }
        System.out.println("số lần ký tự " + KITU_O + " xuất hiện trong chuỗi = " + count);
    }

    void countCharWhileLoop(String input) {
        int count = 0;
        int i = 0;
        while (i < input.length()) {
            char kitu = input.charAt(i);
            if (kitu == KITU_O) {
                count++;
            }
            i++;
        }
        System.out.println("số lần ký tự " + KITU_O + " xuất hiện trong chuỗi = " + count);
    }

    void countCharDoWhileLoop(String input) {
        int count = 0;
        int i = 0;
        do {
            char kitu = input.charAt(i);
            if (kitu == KITU_O) {
                count++;
            }
            i++;
        } while (i < input.length());
        System.out.println("số lần ký tự " + KITU_O + " xuất hiện trong chuỗi = " + count);
    }

}
