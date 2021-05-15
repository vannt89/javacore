import java.util.ArrayList;

public class Bai5 {

    void giaiBT5() {
        System.out.println("\n\nBài 5 - Viết chương trình in ra màn hình index của tất cả ký tự ‘o’ trong chuỗi: “You only live once, but if you do it right, once is enough”");
        String chars = "You only live once, but if you do it right, once is enough";
        getIndexOfCharForLoop(chars, 'o');
    }

    void getIndexOfCharForLoop(String chars, char kitu) {
        String indexOfChar = "";
        for (int i = 0; i < chars.length(); i++) {
            int index = chars.indexOf(kitu, i);
            if (i == index) {
                indexOfChar += index + "\t";
            }
        }
        System.out.println("index của ký tự '" + kitu + "' lần lượt là: " + indexOfChar);
    }

    void getIndexOfCharWhileLoop(String chars, char kitu) {
        int i = 0;
        String indexOfChar = "";
        while (i < chars.length()) {
            int index = chars.indexOf(kitu, i);
            if (i == index) {
                indexOfChar += index + "\t";
            }
            i++;
        }
        System.out.println("index của ký tự '" + kitu + "' lần lượt là: " + indexOfChar);
    }
}
