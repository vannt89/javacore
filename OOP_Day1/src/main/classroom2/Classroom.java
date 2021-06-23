package main.classroom2;

public class Classroom {

    private String id;
    private String name;
    private int year;
    private Student[] students = new Student[45];
    private int lastAddedStudentIndex = -1;

    public Classroom(String id, String name, int year) {
        this.id = id;
        this.name = name;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addStudent(Student aStudent) {
        if (lastAddedStudentIndex < students.length) {
            lastAddedStudentIndex++;
            students[lastAddedStudentIndex] = aStudent;
        }
    }

    public Student[] getStudents() {
        Student[] actualStudents = new Student[lastAddedStudentIndex + 1];
        for (int i = 0; i < actualStudents.length; i++) {
            actualStudents[i] = students[i];
        }
        return actualStudents;
    }

    public int getStudentCount() {
        return lastAddedStudentIndex + 1;
    }

    public Student getStudentByID(int studentID) {
        for (Student student : students) {
            if (student != null) {
                if (student.getId() == studentID) {
                    return student;
                }
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "Class[" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", year=" + getYear() +
                ']';
    }
}
