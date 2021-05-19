import java.util.Scanner;

public class Bai9 {

    /**
     * Viết chương trình thực hiện chuẩn hoá một xâu ký tự nhập từ bàn phím
     * loại bỏ các dấu cách thừa, chuyển ký tự đầu mỗi từ thành chữ hoa
     * các ký tự khác thành chữ thường
     **/

    public void giaiBT9() {
        System.out.println("\n\nBài 9 - Nhập vào 1 chuỗi từ bàn phím và loại bỏ dấu cách thừa, chuyển kí tự đầu mỗi từ thành chữ hoa, các kí tự khác thành chữ thường");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ký tự: ");
        String input = sc.nextLine();
        capsFirstLetter(input);
    }

    public String removeAllWhiteSpace(String input) {
        String str = input.replaceAll("\\s+", " ").trim();
        return str;
    }

    public void capsFirstLetter(String input) {
        String newInput = removeAllWhiteSpace(input);
        char[] charArray = newInput.toCharArray();
        boolean foundSpace = true;
        if (!newInput.equals("") && newInput != null) {
            for (int i = 0; i < charArray.length; i++) {
                if (Character.isLetter(charArray[i])) {
                    if (foundSpace) {
                        charArray[i] = Character.toUpperCase(charArray[i]);
                        foundSpace = false;
                    } else {
                        charArray[i] = Character.toLowerCase(charArray[i]);
                    }
                } else {
                    foundSpace = true;
                }
            }
            newInput = String.valueOf(charArray);
            System.out.println("Chuỗi kí tự sau khi chuẩn hoá: \n" + newInput);
        } else {
            System.out.println("Hãy nhập vào chuỗi từ bạn nhé");
        }
    }
}



