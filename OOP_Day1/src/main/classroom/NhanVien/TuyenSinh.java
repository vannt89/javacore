package main.classroom.NhanVien;

import main.classroom.Interface.IStaff;
import main.classroom.Person;

public class TuyenSinh extends Person implements IStaff {
    public TuyenSinh(int id, String name, int age, String gender) {
        super(id, name, age, gender);
    }

    @Override
    public void nhanCheDo() {
        System.out.println("Tuyển sinh có chế độ 2 - bình thường");
    }

    public void tuyenSinh(){
        System.out.println("Tôi làm tuyển sinh");
    }
}
