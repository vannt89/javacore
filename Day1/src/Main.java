public class Main {

    public static void main(String args[]) {
        System.out.println("Hello VanNT");

        //homework day1
        System.out.println("***Calculate S and P of a rectangle***");
        Rectangle rectangle = new Rectangle();
        rectangle.calculateRectangularArea();
        rectangle.calculateRectangularPerimeter();

        System.out.println("\n***Calculate S and D of a circle***");
        Circle circle = new Circle();
        double s = circle.calculateCircleArea();
        System.out.println("Area of a circle = " + s);

        double c = circle.calculateCircleDiameter();
        System.out.println("Diameter of a circle = " + c);
    }


}
