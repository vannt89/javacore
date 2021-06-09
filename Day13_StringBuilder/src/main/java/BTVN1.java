public class BTVN1 {

    /*
     * 1 - Viết chương trình nhập vào tên đầy đủ của một người, chuẩn hóa tên của người đó,
     * nếu trong tên nhập vào có số thì báo lỗi và yêu cầu nhập lại
     */
    public boolean giaiBTVN1(String input) {
        System.out.println("\nInput: " + input);
        boolean isNotContainDigit = false;
        if (!checkIfContainDigits(input)) {
            isNotContainDigit = true;
            capsFirstLetter(input);
        }
        return isNotContainDigit;
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
        for (String str : strArr) {
            char[] chars = str.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            str = new String(chars);
            output.append(str).append(" ");
        }

        System.out.print("\t-> Output: " + output.toString() + "\n");
        return output.toString();
    }
}
