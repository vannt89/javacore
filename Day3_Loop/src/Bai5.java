import java.util.Scanner;

public class Bai5 {

    void giaiBT5() {
        System.out.println("\n\nBài 5 - Viết chương trình in ra màn hình index của tất cả ký tự ‘o’ trong chuỗi: “You only live once, but if you do it right, once is enough”");
        String chars = "You only live once, but if you do it right, once is enough";
        Utils.subMenu();
        chooseSubMenu(chars);
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

    void getIndexOfCharDoWhileLoop(String chars, char kitu) {
        int i = 0;
        String indexOfChar = "";
        do {
            int index = chars.indexOf(kitu, i);
            if (i == index) {
                indexOfChar += index + "\t";
            }
            i++;
        } while (i < chars.length());
        System.out.println("index của ký tự '" + kitu + "' lần lượt là: " + indexOfChar);
    }

    void chooseSubMenu(String chars) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.print("\nBạn chọn cách giải số: ");
            number = scanner.nextInt();
            switch (number) {
                case 0:
                    System.out.println("Bạn vừa thoát khỏi bài 5");
                    break;
                case 1:
                    getIndexOfCharForLoop(chars, 'o');
                    break;
                case 2:
                    getIndexOfCharWhileLoop(chars, 'o');
                    break;
                case 3:
                    getIndexOfCharDoWhileLoop(chars, 'o');
                    break;
                default:
                    System.out.println("Chỉ có 3 cách giải bài tập từ 1-3 thôi. Nhấn 0 để thoát bài này");
                    break;
            }
        } while (number > 0);
    }
}
