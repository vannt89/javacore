public class Calculator {

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public boolean compareString(String strA, String strB) {
        if (strA.contains(strB)) {
            return true;
        } else {
            return false;
        }
    }
}
