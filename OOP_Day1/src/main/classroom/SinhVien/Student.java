package main.classroom.SinhVien;

import main.classroom.Interface.IStudent;
import main.classroom.Person;

public class Student extends Person implements IStudent {

    private String currentClassroom;
    private StudentStatus studentStatus;

    public Student(int id, String name, int age, String gender, String currentClassroom, StudentStatus studentStatus) {
        super(id, name, age, gender);
        this.currentClassroom = currentClassroom;
        this.studentStatus = studentStatus;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void hoc() {
        System.out.println("Student can learn");
    }

    @Override
    public void choiGame() {
        System.out.println("Student can play game");
    }

    @Override
    public String toString() {
        return "Student[" +
                "currentClassroom='" + currentClassroom + '\'' +
                ", studentStatus=" + studentStatus +
                ']';
    }
}
