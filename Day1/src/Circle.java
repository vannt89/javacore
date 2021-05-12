public class Circle {

    int r = 8;
    double pi = 3.14;

    double calculateCircleArea() {
        double s = r * r * pi;
        return s;
    }

    double calculateCircleDiameter() {
        double c = r * 2 * pi;
        return c;
    }

}
