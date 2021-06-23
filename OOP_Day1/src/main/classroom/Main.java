package main.classroom;

import main.classroom.LopHoc.Classroom;
import main.classroom.SinhVien.Student;
import main.classroom.SinhVien.StudentStatus;

import java.util.ArrayList;


public class Main {

    /*
     * 2. Trong một trường học có:
     * Giảng viên (full time, cộng tác viên, thỉnh giảng)
     * Nhân viên (tuyển sinh, kế toán, quét dọn, bảo vệ)
     * Sinh viên (đang học, đã ra trường, chuẩn bị nhập học)
     * Hãy xây dựng hệ class, interface mô tả chi tiết nhất có thể lớp học tại Vinschool
     */

    public static void main(String args[]) {
        System.out.println("Mô phỏng lớp học");

        Classroom class1 = new Classroom("CNTT1", "Lap trinh", 2013);
        Classroom class2 = new Classroom("CNTT2", "Lap trinh", 2013);
        Classroom class3 = new Classroom("CNTT3", "Lap trinh", 2021);
        Classroom class4 = new Classroom("CK1", "Co khi", 2012);
        Classroom class5 = new Classroom("CK2", "Co khi", 2020);
        Classroom class6 = new Classroom("CK3", "Co khi", 2021);

        Student s1 = new Student(1, "Van", 28, "Female", class1.getName(), StudentStatus.DA_RA_TRUONG);
        Student s2 = new Student(2, "Thuy", 20, "Female", class2.getName(), StudentStatus.DANG_HOC);
        Student s3 = new Student(3, "Phong", 18, "Male", class3.getName(), StudentStatus.CHUAN_BI_NHAP_HOC);

        Student s4 = new Student(4, "Nhien", 27, "Female", class4.getName(), StudentStatus.DA_RA_TRUONG);
        Student s5 = new Student(5, "Hong", 20, "Female", class5.getName(), StudentStatus.DANG_HOC);
        Student s6 = new Student(6, "Nam", 18, "Male", class6.getName(), StudentStatus.CHUAN_BI_NHAP_HOC);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        for (Student student : students) {
            System.out.println(student);
        }
    }

}
