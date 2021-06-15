import java.util.Scanner;

public class Bai2 {

    /*
     * Viết chương trình nhập mật khẩu, yêu cầu mật khẩu phải có từ 10 ký tự trở lên trong đó có ít nhất 1 ký tự in hoa, 1 ký tự số, 1 ký tự đặc biệt như . , - _,…
     * Nếu mật khẩu ít hơn 10 ký tự thông báo mật khẩu yếu
     * Nếu thiếu một trong các ký tự trên thì thông báo mật khẩu chưa đủ mạnh
     */
    public void giaiBKT2() {
        Bai2 bai2 = new Bai2();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mật khẩu: ");
        String password = scanner.nextLine();

        if (bai2.isValid(password)) {
            System.out.println("Mật khẩu hợp lệ");
        }
    }

    public boolean isValid(String password) {
        if (password.length() <= 10) {
            System.out.println("Mật khẩu yếu. Mật khẩu phải có từ 10 ký tự trở lên");
            return false;
        }

        if (password.contains(" ")) {
            System.out.println("Mật khẩu không được chứa kí tự space");
            return false;
        }

        if (!checkDigitsChar(password)) {
            System.out.println("Mật khẩu chưa đủ mạnh. Mật khẩu phải chứa ít nhất 1 chữ số");
            return false;
        }

        if (!checkSpecialChar(password)) {
            System.out.println("Mật khẩu chưa đủ mạnh. Mật khẩu phải chứa ít nhất 1 kí tự đặc biệt");
            return false;
        }

        if (!checkCapsChar(password)) {
            System.out.println("Mật khẩu chưa đủ mạnh. Mật khẩu phải chứa ít nhất 1 kí tự viết hoa");
            return false;
        }

        if (!checkSmallLetter(password)) {
            System.out.println("Mật khẩu chưa đủ mạnh. Mật khẩu phải chứa ít nhất 1 kí tự viết thường");
            return false;
        }

        return true;
    }

    public boolean checkSpecialChar(String password) {
        if ((password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCapsChar(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                count = 1;
            }
        }
        if (count == 0) {
            return false;
        }
        return true;
    }

    public boolean checkDigitsChar(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                count = 1;
            }
        }
        if (count == 0) {
            return false;
        }
        return true;
    }

    public boolean checkSmallLetter(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) {
                count = 1;
            }
        }
        if (count == 0) {
            return false;
        }
        return true;
    }

    public boolean isValidPassword(String password) {
        if (password.length() <= 10) {
            System.out.println("Mật khẩu yếu. Mật khẩu phải có từ 10 ký tự trở lên");
            return false;
        }

        if (password.contains(" ")) {
            System.out.println("Mật khẩu không được chứa kí tự space");
            return false;
        }

        if (!isMatchRegex(password)) {
            System.out.println("Mật khẩu phải có ít nhất 1 ký tự in hoa, 1 ký tự số, 1 ký tự đặc biệt");
            return false;
        }

        return true;
    }

    public boolean isMatchRegex(String password) {
        return password.matches("\"^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$\"\n");
    }
}
