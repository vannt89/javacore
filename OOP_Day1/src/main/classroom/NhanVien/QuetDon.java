package main.classroom.NhanVien;

import main.classroom.Interface.IStaff;
import main.classroom.Person;

public class QuetDon extends Person implements IStaff {
    public QuetDon(int id, String name, int age, String gender) {
        super(id, name, age, gender);
    }


    @Override
    public void nhanCheDo() {
        System.out.println("Quét dọn có chế độ 2 - bình thường");
    }

    public void quetDon() {
        System.out.println("Tôi quét dọn cho trường xanh sạch đẹp");
    }
}
