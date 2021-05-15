import java.util.Scanner;

public class Bai8 {
    public static final char SPACE = ' ';

    void giaiBT8() {
        System.out.println("\n\nBài 8 - Viết chương trình nhập vào một chuỗi và đếm số từ của chuỗi đó");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi từ: ");
        String words = scanner.nextLine();

//        countWordsSplit(words);
        countWordsDoWhileLoop(words);
    }

    public void countWordsSplit(String input) {
        String[] arr = new String[0];
        if (!input.equals("") && input != null) {
            String words = input.trim();
            arr = words.split("\\s+");
            System.out.println("Số từ trong chuỗi = " + arr.length);
        } else {
            System.out.println("Hãy nhập vào chuỗi từ bạn nhé");
        }
    }

    public void countWordsDoWhileLoop(String input) {
        int count = 0;
        boolean notCounted = true;
        if (!input.equals("") && input != null) {
            int i = 0;
            do {
                if (input.charAt(i) != SPACE) {
                    if (notCounted) {
                        count++;
                        notCounted = false;
                    }
                } else {
                    notCounted = true;
                }
                i++;
            } while (i < input.length());
            System.out.println("Số từ trong chuỗi = " + count);
        } else {
            System.out.println("Hãy nhập vào chuỗi từ bạn nhé");
        }
    }

    public void countWordsWhileLoop(String input) {
        int count = 0;
        boolean notCounted = true;
        if (!input.equals("") && input != null) {
            int i = 0;
            while (i < input.length()) {
                if (input.charAt(i) != SPACE) {
                    if (notCounted) {
                        count++;
                        notCounted = false;
                    }
                } else {
                    notCounted = true;
                }
                i++;
            }
            System.out.println("Số từ trong chuỗi = " + count);
        } else {
            System.out.println("Hãy nhập vào chuỗi từ bạn nhé");
        }
    }

    public void countWordsForLoop(String input) {
        int count = 0;
        boolean notCounted = true;
        if (!input.equals("") && input != null) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != SPACE) {
                    if (notCounted) {
                        count++;
                        notCounted = false;
                    }
                } else {
                    notCounted = true;
                }
            }
            System.out.println("Số từ trong chuỗi = " + count);
        } else {
            System.out.println("Hãy nhập vào chuỗi từ bạn nhé");
        }
    }
}
