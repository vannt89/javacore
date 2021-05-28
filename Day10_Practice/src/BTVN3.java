import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BTVN3 {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public void giaiBTVN3() {
        System.out.println("\nBTVN3 - Kiểm tra định dạng email nhập vào");
        String email = "";
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter email: ");
            email = scanner.nextLine();
        } while (!validateEmail(email));
    }

    public boolean validateEmail(String email) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        boolean isMatched = matcher.find();
        if (isMatched) {
            System.out.println("*** Email Valid ***");
        } else {
            System.out.println(">> Email Invalid. Please enter again");
        }
        return isMatched;
    }

}
