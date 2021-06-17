import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<Employee> list = new ArrayList<Employee>();

        Employee employee = new Employee(1, "Van", 30);
        list.add(employee);
        list.add(new Employee(2, "Linh", 28));

        for (Employee e : list) {
            System.out.println(e);
        }

        //Tìm thông tin nhân viên tên Linh and remove or update
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals("Linh")) {
                System.out.println("Thông tin nhân viên: " + list.get(i));
//                list.remove(list.get(i));
//                list.set(i, new Employee(2, "Hoa", 30));
                list.get(i).setName("Ngoc");
            }
        }

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId() == 2) {
//                System.out.println("Thông tin nhân viên: " + list.get(i));
//            }
//        }

        for (Employee e : list) {
            System.out.println(e);
        }
    }

}
