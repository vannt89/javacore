import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCharacterCounter {

    /**
     * UniqueCharacterCounter: đếm số kí tự unique có trong chuỗi (kí tự trùng thì xoá đi)
     * Input: abbc
     * Output: 2 (chỉ đếm kí tự a-c)
     */
    static Map map = new HashMap();

    public static int countUniqueCharacters(String input) {
//        Object obj = map.get(input);
//        if (obj != null)
//            return ((Integer) obj).intValue();

        // Result was not in the cache, calculate it.
        Set occurred = new TreeSet();
        Set duplicates = new TreeSet();

        // Identify occurrences and duplicates for each character in string
        //Xác định các lần xuất hiện và trùng lặp cho từng ký tự trong chuỗi
        for (int i = 0; i < input.length(); i++) {
            Character character = new Character(input.charAt(i));
            if (duplicates.contains(character)) {
                continue;
            }
            boolean newOccurrence = occurred.add(character);
            if (!newOccurrence) {
                duplicates.add(character);
            }
        }

        // Remove duplicates from occurrence count to obtain result
        // Xóa các bản sao khỏi số lần xuất hiện để thu được kết quả
        occurred.removeAll(duplicates);
        int result = occurred.size();

        // Put result in cache before returning:
        map.put(input, result);
        return result;
    }

    public static void main(String[] args) {
//        int nArgs = args.length;
//        for (int i=0; i<nArgs; i++) {
//            String argument = args[i];
//            int result = countUniqueCharacters(argument);
//            System.out.println(argument + ": " + result);
//        }
//        String[] input = new String[]{"abcdd"};
//        for (int i = 0; i < input.length; i++) {
//            String argument = input[i];
//            int result = countUniqueCharacters(argument);
//            System.out.println(argument + ": " + result);
//        }
        System.out.println(countUniqueCharacters("abbbc"));


    }

}
