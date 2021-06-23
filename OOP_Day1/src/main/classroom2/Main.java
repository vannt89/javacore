package main.classroom2;

public class Main {

    public static void main(String args[]) {
        Student s1 = new Student(116, "Van", 21, "Female");
        Student s2 = new Student(118, "Thuy", 22, "Female");

        Classroom classroom1 = new Classroom("C1", "CNTT", 2019);
        classroom1.addStudent(s1);
        classroom1.addStudent(s2);
        classroom1.addStudent(new Student(229, "Hoang", 22, "Female"));

        Student[] students = classroom1.getStudents();

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Total Student: " + classroom1.getStudentCount());

        System.out.println("Student: " + classroom1.getStudentByID(117));
        System.out.println("Student: " + classroom1.getStudentByID(118));
    }
}
