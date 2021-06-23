package main.classroom.NhanVien;

import main.classroom.Interface.IStaff;
import main.classroom.Person;

public class BaoVe extends Person implements IStaff {
    public BaoVe(int id, String name, int age, String gender) {
        super(id, name, age, gender);
    }

    @Override
    public void nhanCheDo() {
        System.out.println("Bảo vệ có chế độ 1 - tốt nhất");
    }

    public void canhGacTruong(){
        System.out.println("Nhiệm vụ của tôi là canh gác trường");
    }
}
