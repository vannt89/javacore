package BTVN;

public class Employees {

    private String empID;
    private String empName;
    private int age;
    private String address;
    private String phoneNumber;
    private String msg;

    public Employees(String empID, String empName, int age, String address, String phoneNumber) {
        this.empID = empID;
        this.empName = empName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Employees(String msg) {
        this.msg = msg;
        System.out.println(msg);
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber;
    }
}
