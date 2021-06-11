public class ReverseName {

    public String reverseName(String name) {
        StringBuilder strReverse = new StringBuilder();
        name = name.trim();
        String[] array = name.split("\\s");
        for (int j = array.length; j >= 0; j--) {
            strReverse.append(array[j]);
            strReverse.append(' ');

        }
        return strReverse.toString().trim();
    }

}
