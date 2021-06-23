package main.classroom.LopHoc;

public class Classroom {

    private String id;
    private String name;
    private int year;

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

    @Override
    public String toString() {
        return "Class[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ']';
    }
}
