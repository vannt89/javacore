package BTVN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeesManagement {
    Scanner scanner = new Scanner(System.in);
    List<Employees> listEmp = new ArrayList<Employees>();

    public void printEmployee() {
        for (Employees e : listEmp) {
            System.out.println(e);
        }
    }

    public void addProduct(Employees employees) {
        listEmp.add(employees);
    }

    public boolean updateEmployeeC1(String name) {
        boolean isExist = false;
        for (int i = 0; i < listEmp.size(); i++) {
            if (listEmp.get(i).getEmpName().equals(name)) {
                isExist = true;
                System.out.println("Thông tin nhân viên tìm kiếm: " + listEmp.get(i));
                listEmp.set(i, new Employees(listEmp.get(i).getEmpID(), "Thuy", 29, "TP HCM", "123456789"));

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
