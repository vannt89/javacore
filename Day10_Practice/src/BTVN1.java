import java.util.Scanner;

public class BTVN1 {

    public void giaiBTVN1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string A: ");
        String strA = scanner.nextLine();

        System.out.println("Enter string B: ");
        String strB = scanner.nextLine();

        if (strA.contains(strB)) {
            System.out.println("Chuỗi A chứa chuỗi B");
        } else {
            System.out.println("Chuỗi A ko chứa chuỗi B");
        }
    }

}
