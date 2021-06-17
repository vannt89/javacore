package BTVN;

import java.util.Scanner;

public class EmployeesMain {

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
        EmployeesManagement emp = new EmployeesManagement();
        emp.addProduct(new Employees("NV1", "Van", 28, "Ha Noi", "0902299316"));
        emp.addProduct(new Employees("NV2", "Hoa", 27, "Ha Nam", "0902299317"));
        emp.addProduct(new Employees("NV3", "Mai", 26, "Ha Tinh", "0902299318"));
        emp.addProduct(new Employees("NV4", "Nam", 25, "Ha Tay", "0902299319"));

        System.out.println("Danh sách nhân viên hiện có là: ");
        emp.printEmployee();

        /////Update C1
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập tên nhân viên muốn tìm kiếm: ");
        String name1 = scanner.nextLine();
        if (!emp.updateEmployeeC1(name1)) {
            System.out.println("Không có nhân viên này");
        }

//        /////Update C2
        System.out.println("\nNhập tên nhân viên muốn tìm kiếm: ");
        String name2 = scanner.nextLine();
        if (!emp.updateEmployeeC2(name2)) {
            System.out.println("Không có nhân viên này");
        }

        /////Delete product
        System.out.println("\nNhập mã nhân viên muốn tìm kiếm: ");
        String name3 = scanner.nextLine();
        emp.removeEmployeeC1(name3);
    }


}
