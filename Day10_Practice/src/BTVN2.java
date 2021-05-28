import java.util.Arrays;
import java.util.Scanner;

public class BTVN2 {

    /**
     * Loại bỏ các kí tự giống nhau trong chuỗi
     */
    public void giaiBTVN2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input: ");
        String input = scanner.nextLine();

        removeDuplicateCharsC1(input);
//        removeDuplicateCharsC2(input);
    }

    public void removeDuplicateCharsC1(String input) {
        String output = new String();
        for (int i = 0; i < input.length(); i++) {
            String str = String.valueOf(input.charAt(i));
            if (!output.contains(str)) {
                output = output.concat(str);
            }
        }
        System.out.println("Output = " + output);
    }

    public void removeDuplicateCharsC2(String input) {
        String output = new String();
        for (int i = 0; i < input.length(); i++) {
            boolean isDuplicate = false;
            String str = String.valueOf(input.charAt(i));
            for (int j = 0; j < output.length(); j++) {
                if (input.charAt(i) == output.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate == false) {
                output = output.concat(str);
            }
        }
        System.out.println("Output = " + output);
    }


}
