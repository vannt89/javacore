import java.util.Scanner;

public class BTVN1 {

    /*
     * 1 - Viết chương trình nhập vào tên đầy đủ của một người, chuẩn hóa tên của người đó,
     * nếu trong tên nhập vào có số thì báo lỗi và yêu cầu nhập lại
     */
//    public static void main(String args[]) {
//        BTVN1 btvn1 = new BTVN1();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter full name: ");
//        String fullName = scanner.nextLine();
//
//        while (btvn1.checkIfContainDigits(fullName)) {
//            System.out.println("Please enter full name again: ");
//            fullName = scanner.nextLine();
//        }
//        if (!btvn1.checkIfContainDigits(fullName)) {
//            btvn1.capsFirstLetter(fullName);
//        }
//
//    }

    public String giaiBTVN1(String input) {
        System.out.println("\nInput: " + input);
        String output = "";
        if (!checkIfContainDigits(input)) {
            output = capsFirstLetter(input);
        }
        System.out.print("\t-> Output: " + output + "\n");
        return output;
    }

    public boolean checkIfContainDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println("\t-> Error: Tên ko dc chứa chữ số");
                return true;
            }
        }
        return false;
    }

    public String capsFirstLetter(String input) {
        StringBuilder output = new StringBuilder();
        String[] strArr = input.trim().split("\\s+");
        if (strArr.length >= 2) {
            for (String str : strArr) {
                char[] chars = str.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (i == 0) {
                        chars[0] = Character.toUpperCase(chars[0]);
                    } else {
                        chars[i] = Character.toLowerCase(chars[i]);
                    }
                }
                str = new String(chars);
                output.append(str).append(" ");
            }
        } else {
            System.out.println("Hãy nhập đầy đủ họ và tên");
        }
        return output.toString().trim();
    }
}
