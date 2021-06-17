import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String args[]) {
        List<String> listCars = new ArrayList<String>();
        listCars.add("BMW");
        listCars.add("Vinfast");
        listCars.add("Mercedes");
        listCars.add("Toyota");

        System.out.println("List = " + listCars);

        listCars.add(3, "Hyundai");
        System.out.println("List = " + listCars);

        System.out.println(listCars.indexOf("Vinfast"));
    }



}
