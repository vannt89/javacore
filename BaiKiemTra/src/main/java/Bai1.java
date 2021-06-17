public class Bai1 {

    /*
     * Đếm số từ viết in hoa trong chuỗi
     * Viết in hoa toàn bộ chữ đầu của các từ trong chuỗi đó
     * Chuyển ký tự đầu tiên của chuỗi hoặc ký tự đầu tiên của từ sau dấu chấm là viết in hoa, các chữ con lại viết thường
     */
    public void giaiBKT1() {
        String input = "You Only Live Once. But if You do it right. once is Enough";

        int count = countWordsUpperCase(input);
        System.out.println("Số từ viết in hoa trong chuỗi = " + count);

        System.out.println("\nChuỗi sau khi viết in hoa toàn bộ chữ cái đầu là: ");
        System.out.println(capsFirstLetter1(input));

        System.out.println("\nChuỗi sau khi viết in hoa toàn bộ chữ cái đầu và các chữ còn lại viết thường là: ");
        System.out.println(capsFirstLetter2(input));
    }

    public int countWordsUpperCase(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }

    public String capsFirstLetter1(String input) {
        StringBuilder output = new StringBuilder();
        String[] strArr = input.trim().split("\\s+");
        for (String str : strArr) {
            String firstChar = String.valueOf(str.charAt(0));
            output.append(firstChar.toUpperCase() + str.substring(1));
            output.append(" ");
        }
        return output.toString().trim();
    }

    public String capsFirstLetter(String input) {
        StringBuilder output = new StringBuilder();
        String[] strArr = input.trim().split("\\.");
        for (String str : strArr) {
            str = str.trim();
            String firstChar = String.valueOf(str.charAt(0));
            output.append(firstChar.toUpperCase() + str.substring(1).toLowerCase());
            output.append(". ");
        }
        System.out.println(output.toString().trim());
        return output.toString().trim();
    }

    public String capsFirstLetter2(String input) {
        int pos = 0;
        boolean capitalize = true;
        StringBuilder sb = new StringBuilder(input);
        while (pos < sb.length()) {
            if (sb.charAt(pos) == '.') {
                capitalize = true;
            } else if (capitalize && !Character.isWhitespace(sb.charAt(pos))) {
                sb.setCharAt(pos, Character.toUpperCase(sb.charAt(pos)));
                capitalize = false;
            } else {
                sb.setCharAt(pos, Character.toLowerCase(sb.charAt(pos)));
            }
            pos++;
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

}
