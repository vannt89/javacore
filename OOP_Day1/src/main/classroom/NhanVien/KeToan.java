package main.classroom.NhanVien;

import main.classroom.Interface.IStaff;
import main.classroom.Person;

public class KeToan extends Person implements IStaff {
    public KeToan(int id, String name, int age, String gender) {
        super(id, name, age, gender);
    }

    @Override
    public void nhanCheDo() {
        System.out.println("Kế toán có chế độ 1 - tốt nhất");
    }

    public void chamCong() {
        System.out.println("Tôi sẽ chấm công cho các bạn");
    }
}
