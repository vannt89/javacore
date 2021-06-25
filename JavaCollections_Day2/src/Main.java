import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        ArrayList<Person> persons = new ArrayList<>(List.of(
                new Person("Vinh", "Vietnam", 28),
                new Person("Lan", "Vietnam", 24),
                new Person("John", "USA", 27),
                new Person("Lee", "China", 67),
                new Person("Kim", "Korea", 22),
                new Person("Long", "Vietnam", 18),
                new Person("Jungho", "Korea", 19),
                new Person("Tian", "China", 20),
                new Person("Clara", "USA", 40),
                new Person("Mikura", "Japan", 27),
                new Person("Sony", "Japan", 29),
                new Person("Xiang", "China", 78),
                new Person("Peter", "France", 18),
                new Person("Haloy", "Malaysia", 20),
                new Person("Magie", "Malaysia", 32)));


        PersonMethods p = new PersonMethods();
        System.out.println("1.1 Đếm số người theo từng quốc tịch in ra màn hình");
        p.countPersonByNationality(persons);

        System.out.println("\n1.2 Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình");
        p.sortPersonHaveAgeBiggerThan25YearsOld(persons);

        System.out.println("\n1.3 Tính trung bình tuổi của người theo từng quốc gia");
        p.calAverageAgeByNationality(persons);

        System.out.println("\n1.4 In ra màn hình đánh giá tuổi mỗi người");
        /*
         * < 20 tuổi: nổi loạn
         * 20 đến 30 tuổi: việc làm
         * 31 đến 40 tuổi: sự nghiệp
         * 41 trở lên: hưởng thụ
         */
        p.printContentByAge(persons);

    }


}
