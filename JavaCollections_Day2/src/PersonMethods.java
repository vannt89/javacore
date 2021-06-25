import java.util.*;
import java.util.stream.Collectors;

public class PersonMethods {

    public void countPersonByNationality(List<Person> persons) {
        Map<String, Integer> map = new HashMap<>();
        for (Person p : persons) {
            if (!map.containsKey(p.getNationality())) {
                map.put(p.getNationality(), 1);
            } else {
                int count = map.get(p.getNationality());
                count++;
                map.put(p.getNationality(), count);
            }
        }
        printMap(map);
    }

    public void sortPersonHaveAgeBiggerThan25YearsOld(List<Person> persons) {
        List<Person> sortedList = new ArrayList<>();
        for (Person p : persons) {
            if (p.getAge() > 25) {
                sortedList.add(p);
            }
        }
        sortedList.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }

    public void calAverageAgeByNationality(List<Person> persons) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (Person p : persons) {
            String key = p.getNationality();
            List<Integer> ages = new ArrayList<>();
            if (!map.containsKey(key)) {
                ages.add(p.getAge());
                map.put(key, ages);
            } else {
                ages = map.get(key);
                ages.add(p.getAge());
            }
        }
        Map<String, Double> map2 = new HashMap<>();
        for (String key : map.keySet()) {
            List<Integer> ages = map.get(key);
            int sum = 0;
            for (Integer age : ages) {
                sum += age;
            }
            double avg = calAvg(sum, ages.size());
            double averageAge = Math.floor(avg * 10) / 10;
            map2.put(key, averageAge);
        }
        printMap2(map2);
    }

    public void printContentByAge(List<Person> persons) {
        Map<Person, String> map = new HashMap<>();
        for (Person p : persons) {
            int age = p.getAge();
            if (age < 20) {
                map.put(p, "nổi loạn");
            } else if (age >= 20 && age <= 30) {
                map.put(p, "việc làm");
            } else if (age >= 31 && age <= 40) {
                map.put(p, "sự nghiệp");
            } else {
                map.put(p, "hưởng thụ");
            }
        }
        printMap3(map);
    }

    //1.3 Tính trung bình tuổi của người theo từng quốc gia <Java Stream>
    public void calAverageAgeByNationality2(ArrayList<Person> persons) {
        Map<String, Double> map2 = persons
                .stream()
                .collect(Collectors.groupingBy(
                        user -> user.getNationality(),
                        Collectors.averagingInt(Person::getAge)));
        printMap2(map2);
    }

    private double calAvg(int sum, int n) {
        double avg = (double) sum / n;
        return avg;
    }


    private void printMap(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }

    private void printMap2(Map<String, Double> map) {
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    private void printMap3(Map<Person, String> map) {
        for (Person key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }
    }
}
