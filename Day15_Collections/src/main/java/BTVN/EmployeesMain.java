package BTVN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeesMain {
    Scanner scanner = new Scanner(System.in);
    List<Employees> listEmp = new ArrayList<Employees>();

    /*
     * Quản lý nhân viên bao gồm có mã nhân viên, tên nhân viên, tuổi, địa chỉ, số điện thoại
     * Tiến hành thêm thông tin nhân viên
     * Nhập vào tên nhân viên và tìm kiếm xem tên bạn vừa nhập có trong danh sách không,
     *  nếu có tiến hành sửa thông tin nhân viên đó,
     *  nếu không thông báo ra không có nhân viên này
     * Nhập vào 1 mã nhân viên và kiểm tra xem có mã này trong danh sách nhân viên không
     *  nếu có xoá nhân viên đó ra khỏi danh sách
     *  nếu ko thông báo là không có nhân viên này
     */

    public static void main(String args[]) {
        EmployeesMain main = new EmployeesMain();
        main.addProduct(new Employees("NV1", "Van", 28, "Ha Noi", "0902299316"));
        main.addProduct(new Employees("NV2", "Hoa", 27, "Ha Nam", "0902299317"));
        main.addProduct(new Employees("NV3", "Mai", 26, "Ha Tinh", "0902299318"));
        main.addProduct(new Employees("NV4", "Nam", 25, "Ha Tay", "0902299319"));

        System.out.println("Danh sách nhân viên hiện có là: ");
        main.printEmployee();

        /////Update C1
        Scanner scanner = new Scanner(System.in);
//        System.out.println("\nNhập tên nhân viên muốn tìm kiếm: ");
//        String name1 = scanner.nextLine();
//        if (!main.updateEmployeeC1(name1, new Employees("NV2", "Thuy", 29, "Ha Giang", "0123456789"))) {
//            System.out.println("Không có nhân viên này");
//        }

//        /////Update C2
        System.out.println("\nNhập tên nhân viên muốn tìm kiếm: ");
        String name2 = scanner.nextLine();
        if (!main.updateEmployeeC2(name2)) {
            System.out.println("Không có nhân viên này");
        }

        System.out.println("\nNhập mã nhân viên muốn tìm kiếm: ");
        String name3 = scanner.nextLine();
        main.removeEmployeeC1(name3);
    }

    public void printEmployee() {
        for (Employees e : listEmp) {
            System.out.println(e);
        }
    }

    public void addProduct(Employees employees) {
        listEmp.add(employees);
    }

    public boolean updateEmployeeC1(String name, Employees employees) {
        boolean isExist = false;
        for (int i = 0; i < listEmp.size(); i++) {
            if (listEmp.get(i).getEmpName().equals(name)) {
                isExist = true;
                System.out.println("Thông tin nhân viên tìm kiếm: " + listEmp.get(i));

                listEmp.set(i, employees);

                System.out.println("\nDanh sách nhân viên sau khi thay đổi là: ");
                printEmployee();
                break;
            }
        }
        return isExist;
    }

    public boolean updateEmployeeC2(String name) {
        boolean isExist = false;
        for (int i = 0; i < listEmp.size(); i++) {
            if (listEmp.get(i).getEmpName().equals(name)) {
                isExist = true;
                System.out.println("Thông tin nhân viên tìm kiếm: " + listEmp.get(i));

                System.out.println("Thực hiện thay đổi thông tin nhân viên");
                System.out.println("Nhập tên nhân viên mới: ");
                String newName = scanner.nextLine();
                listEmp.get(i).setEmpName(newName);

                System.out.println("\nDanh sách nhân viên sau khi thay đổi là: ");
                printEmployee();
                break;
            }
        }
        return isExist;
    }

    public void removeEmployeeC1(String name) {
        Employees searchedName = searchEmployeeByNameC1(name);
        if (searchedName.getEmpID() != null) {
            System.out.println("\nXoá nhân viên có mã nhân viên là: " + name);
            listEmp.remove(searchedName);

            System.out.println("\nDanh sách nhân viên sau khi xoá là: ");
            printEmployee();
        }
    }

    public Employees searchEmployeeByNameC1(String name) {
        for (int i = 0; i < listEmp.size(); i++) {
            if (listEmp.get(i).getEmpID().equals(name)) {
                System.out.println("Thông tin nhân viên tìm kiếm: " + listEmp.get(i));
                return listEmp.get(i);
            }
        }
        return new Employees("Không có nhân viên này");
    }

}
