public class ReverseName {

    public String reverseName(String name) {
        StringBuilder strReverse = new StringBuilder();
        name = name.trim();
        String[] array = name.split("\\s");
        for (int i = array.length - 1; i >= 0; i--) {
            strReverse.append(array[i]);
            strReverse.append(' ');

        }
        return strReverse.toString().trim();
    }
}
