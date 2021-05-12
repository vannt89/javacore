public class GiaiPTBac2 {

    float x1;
    float x2;
    float delta;

    void tinhNghiemPTB2(float a, float b, float c) {
        if (a != 0) {
            delta = b * b - 4 * a * c;
            if (delta > 0) {
                x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
                x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
                System.out.println("Phương trình có 2 nghiệm là: \nx1 = " + x1 + " \nx2 = " + x2);
            } else if (delta == 0) {
                x1 = (-b / (2 * a));
                System.out.println("Phương trình có nghiệm kép với x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình có một nghiệm: x = " + (-c / b));
            }
        }
    }
}
