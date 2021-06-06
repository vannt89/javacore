public class Triangle {

    public boolean checkTriangle(float a, float b, float c) {
        boolean isTriangle;
        if (a > 0 && b > 0 && c > 0) {
            if (a < b + c && b < a + c && c < a + b) {
                isTriangle = true;
                System.out.println("3 số: " + (int) a + " , " + (int) b + " , " + (int) c + " tạo thành 1 tam giác");
            } else {
                isTriangle = false;
                System.out.println("3 số: " + (int) a + " , " + (int) b + " , " + (int) c + " không tạo thành 1 tam giác");
            }
        } else {
            isTriangle = false;
            System.out.println("Hãy nhập vào số dương");
        }
        return isTriangle;
    }

}
