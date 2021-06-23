package main.classroom.GiangVien;

import main.classroom.Interface.IStaff;
import main.classroom.Interface.ITeacher;
import main.classroom.Person;

public class GVFullTime extends Person implements ITeacher, IStaff {

    private String maNV;
    private String lopChuNhiem;
    public GVFullTime(int id, String name, int age, String gender, String maNV, String lopChuNhiem) {
        super(id, name, age, gender);
        this.maNV = maNV;
        this.lopChuNhiem = lopChuNhiem;
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
        System.out.println("Giảng viên full time có chế độ 1 - tốt nhất");
    }

    @Override
    public String toString() {
        return "GVFullTime[" +
                "maNV='" + maNV + '\'' +
                ", lopChuNhiem='" + lopChuNhiem + '\'' +
                ']';
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getLopChuNhiem() {
        return lopChuNhiem;
    }

    public void setLopChuNhiem(String lopChuNhiem) {
        this.lopChuNhiem = lopChuNhiem;
    }
}
