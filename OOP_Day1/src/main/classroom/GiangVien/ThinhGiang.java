package main.classroom.GiangVien;

import main.classroom.Interface.IStaff;
import main.classroom.Interface.ITeacher;
import main.classroom.Person;

public class ThinhGiang extends Person implements ITeacher, IStaff {

    private String maNV;
    public ThinhGiang(int id, String name, int age, String gender, String maNV) {
        super(id, name, age, gender);
        this.maNV = maNV;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void dayHoc() {
        System.out.println("Teacher can teach");
    }

    @Override
    public void nhanCheDo() {
        System.out.println("Thỉnh giảng có chế độ 3 - ít nhất");
    }
}
