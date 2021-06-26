import java.util.*;
import java.util.stream.Collectors;

public class PersonMethods {

    public void countPersonByNationality(List<Person> persons) {
        Map<String, Integer> map = new HashMap<>();
        for (Person p : persons) {
            String key = p.getNationality();
            if (!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                int value = map.get(key);
                value++;
                map.put(key, value);
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
        sortedList.sort(Comparator.comparing(Person::getName)
                .thenComparing(Person::getAge));
        for (Person p : sortedList) {
            System.out.println(p);
        }
        ////C2 Java Stream
//        sortedList.stream().sorted(Comparator.comparing(Person::getName)).forEach(System.out::println);
    }

    public void calAverageAgeByNationality(List<Person> persons) {
        Map<String, List<Integer>> map = groupAgeByCountry(persons);
        Map<String, Double> map2 = new HashMap<>();
        for (String key : map.keySet()) {
            List<Integer> values = map.get(key);
            int sum = 0;
            for (Integer age : values) {
                sum += age;
            }
            double averageAge = calAvg(sum, values.size());
            double value = Math.floor(averageAge * 10) / 10;
            map2.put(key, value);
        }
        printMap2(map2);
    }

    private Map<String, List<Integer>> groupAgeByCountry(List<Person> persons) {
        Map<String, List<Integer>> map = new HashMap<>();
        for (Person p : persons) {
            String key = p.getNationality();
            List<Integer> values = new ArrayList<>();
            if (!map.containsKey(key)) {
                values.add(p.getAge());
                map.put(key, values);
            } else {
                values = map.get(key);
                values.add(p.getAge());
            }
        }
        return map;
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
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private void printMap2(Map<String, Double> map) {
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    private void printMap3(Map<Person, String> map) {
        map.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}
