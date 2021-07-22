import javafx.beans.binding.MapExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    /**
     * Concordance: in ra index của từng kí tự, nếu giống nhau trả về 1 list, có dùng Map
     * Input: test
     * Output: {s=[2], t=[0, 3], e=[1]}
     */
//    private Map map = new HashMap();
    Map<Character, List<Integer>> map = new HashMap<>();

    public Concordance() {

    }

    /**
     * Add each character and its index to the concordance
     */
//    public Concordance(String input) {
//        for (int i = 0; i < input.length(); ++i) {
//            char c = input.charAt(i);
//            addToMap(c, i);
//        }
//    }
    public void getIndexOfCharacter(String input) {
        for (int i = 0; i < input.length(); i++) {
            addToMap(input.charAt(i), i);
        }
    }

    /**
     * Update the list of indices for a given character
     */
    void addToMap(char c, int pos) {
//        Map<Character, List<Integer>> map = new HashMap<>();
//        Character key = new Character(c);
//        List values = new ArrayList();
//        if (!map.containsKey(key)) {
//            values.add(pos);
//            map.put(key, values);
//        } else {
//            values = map.get(key);
//            values.add(pos);
//        }

//        for (Character ch : map.keySet()) {
//            System.out.println(ch + ": " + map.get(ch));
//        }

        ////C2
//        List list = (List) map.get(key);
//        if (list == null) {
//            list = new ArrayList();
//            map.put(key, list);
//        }
//        list.add(pos);
    }

    public static void main(String[] args) {
        Concordance conc = new Concordance();
        String input = "test";
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            Character key = new Character(input.charAt(i));
            List values = new ArrayList();
            if (!map.containsKey(key)) {
                values.add(i);
                map.put(key, values);
            } else {
                values = map.get(key);
                values.add(i);
            }
        }
        System.out.println(map);

//        for (Character ch : map.keySet()) {
//            System.out.print(ch + "=" + map.get(ch) + " ");
//        }

//        StringBuffer input = new StringBuffer();
//        for (int i = 0; i < args.length; ++i)
//            input.append(args[i]);

//        Concordance conc = new Concordance(input);
//        System.out.println(conc.map);

//        Concordance conc = new Concordance();
//        conc.getIndexOfCharacter(input);
//        System.out.println(conc.map);
    }

//    private void printMap2(Map<String, Double> map) {
//        for (String key : map.keySet()) {
//            System.out.println(key + ": " + map.get(key));
//        }
//    }

}
