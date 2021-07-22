package controller;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Person;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class PersonRepository {
    private List<Person> people = new ArrayList<Person>();

    public PersonRepository() {
        ObjectMapper objectMapper = new ObjectMapper();
        File classpathRoot = new File(System.getProperty("user.dir"));
        System.out.println(classpathRoot);
        File assetDir = new File(classpathRoot, "/PersonStream/src/main/resources/static");
        File file = null;
        try {
            file = new File(assetDir.getCanonicalPath() + "/person.json");

            people = (List<Person>) objectMapper.readValue(file, Person.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Person> getAll() {
        return people;
    }

    //2.1 Nhóm những người trong cùng thành phố lại
    public Map<String, List<Person>> groupPeopleByCity() {
        // https://www.baeldung.com/java-groupingby-collector
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getCity));
    }

    public Map<String, Long> groupByCityThenCount() {
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));
    }

    //2.2 Nhóm các nghề nghiệp và đếm số người làm
    public Map<String, Long> groupByJobThenCount() {
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getJob, Collectors.counting()));
    }

    //2.3 Tìm 5 nghề có nhiều người làm nhất, đếm từ cao xuống thấp
    public Map<String, Long> fiveTopJobs() {
        Map<String, Long> jobGroupedThenCount = groupByJobThenCount();

        return jobGroupedThenCount
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));
    }

    //2.4 Tìm 5 thành phố có nhiều người trong danh sách ở nhất, đếm từ cao xuống thấp
    public Map<String, Long> fiveTopPopulationCities() {
        //Nhóm theo City sau đó đếm số People trong City
        Map<String, Long> groupByCityThenCount = people
                .stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()));


        return groupByCityThenCount.entrySet()  //Chuyển kết quả sang Set<Map.Entry<K, V>>
                .stream() //Với List và Set interface thì chúng ta có stream để duyệt
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  //Sắp xếp theo Value
                .limit(5)  //Giới hạn 5 phần tử
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                )); //Collectors.toMap để nhặt ra phần tử tạo ra LinkedHashMap mới
    }

    //Tìm ra nghề nào có nhiều nhất trong một nhóm người bất kỳ
    public Map.Entry<String, Long> topJobInPeopleGroup(List<Person> peopleGroup) {
        Optional<Map.Entry<String, Long>> result = peopleGroup
                .stream()
                .collect(Collectors.groupingBy(Person::getJob, Collectors.counting()))  //Nhóm theo Job
                .entrySet()
                .stream()
                .collect(Collectors.maxBy(Map.Entry.comparingByValue())); //Tìm lớn nhất

        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("Cannot find top job in people group");
        }

    }

    //2.5 Trong mỗi thành phố, hãy tìm ra nghề nào được làm nhiều nhất
    public Map<String, Map.Entry<String, Long>> topJobByNumerInEachCity() {
        Map<String, List<Person>> groupPeopleByCity = groupPeopleByCity();

        return groupPeopleByCity.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, entry -> topJobInPeopleGroup(entry.getValue()))
    /*
    Chuyển đổi Map<City, List<Person>> sang 
    Map<City, <Job, JobCount>>
    */
                );
    }

    //2.6 Ứng với một nghề, hãy tính mức lương trung bình
    public Map<String, Double> averageSalaryByJob() {
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getJob, Collectors.averagingInt(Person::getSalary)));
    }

    //2.7 Năm thành phố có mức lương trung bình cao nhất
    public List<Map.Entry<String, Double>> fiveCitiesHasTopAverageSalary() {
        Map<String, List<Person>> groupPeopleByCity = groupPeopleByCity();

        Map<String, Double> cityAverageSalary = groupPeopleByCity.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> entry.getValue()
                                .stream()
                                .collect(Collectors.averagingInt(Person::getSalary))));


        return cityAverageSalary.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toList());
    }

    //2.8 Năm thành phố có mức lương trung bình của developer cao nhất
    public List<Map.Entry<String, Double>> fiveCitiesHasTopSalaryForDeveloper() {

        Map<String, List<Person>> groupDevelopersByCity = people
                .stream()
                .filter(p -> p.getJob().equals("developer"))
                .collect(Collectors.groupingBy(Person::getCity));

        Map<String, Double> cityAverageSalary = groupDevelopersByCity.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> entry.getValue()
                                .stream()
                                .collect(Collectors.averagingInt(Person::getSalary))));


        return cityAverageSalary.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toList());
    }

    //2.9 Tuổi trung bình từng nghề nghiệp
    public Map<String, Double> averageAgePerJob() {
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getJob, Collectors.averagingInt(Person::getAge)));
    }

    //2.10 Tuổi trung bình ở từng thành phố
    public Map<String, Double> averageAgePerCity() {
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.averagingInt(Person::getAge)));
    }


    //2.11 Tuổi cao nhất trong mỗi thành phố
    public List<Map.Entry<String, Integer>> maxAgePerCity() {
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getCity, //nhóm người theo thành phố
                        Collectors.maxBy(Comparator.comparing(Person::getAge)))) //tìm ra người cao tuổi nhất
                .values() //lấy danh sách những người cao tuổi trong từng thành phố
                .stream() //duyệt
                .map(person -> Map.entry(person.get().getCity(), person.get().getAge())) //Tạo Map.entry<Tên thành phố, tuổi>
                .collect(Collectors.toList()); //chuyển nó sang thành List
    }

    //2.12 tỷ lệ nam / nữ trong toàn bộ dữ liệu
    public Double maleFemaleRatio() {
        Long maleCount = people
                .stream()
                .filter(p -> p.getGender().equals("Male"))
                .collect(Collectors.counting());

        return (double) maleCount / (double) (people.size() - maleCount);
    }

    public Double maleFemaleRatio(List<Person> people) {
        Long maleCount = people
                .stream()
                .filter(p -> p.getGender().equals("Male"))
                .collect(Collectors.counting());

        return (double) maleCount / (double) (people.size() - maleCount);
    }

    ////1. Trả về danh sách 'developer' ở các thành phố Hanoi, Saigon, Shanghai
    public Map<String, List<Person>> findDeveloperOf3City() {
        Map<String, List<Person>> map = filterDeveloperByCity();
        return map
                .entrySet()
                .stream()
                .filter(p -> p.getKey().equals("Hanoi") || p.getKey().equals("Saigon") || p.getKey().equals("Shanghai"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));
    }

    public Map<String, List<Person>> findDeveloperOf3City2() {
        return people
                .stream()
                .filter(p -> p.getJob().equals("developer"))
                .collect(Collectors.groupingBy(Person::getCity))
                .entrySet()
                .stream()
                .filter(p -> p.getKey().equals("Hanoi") || p.getKey().equals("Saigon") || p.getKey().equals("Shanghai"))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));
    }

    private Map<String, List<Person>> filterDeveloperByCity() {
        return people
                .stream()
                .filter(p -> p.getJob().equals("developer"))
                .collect(Collectors.groupingBy(Person::getCity));
    }

    ////2. Tìm ra thành phố có độ tuổi trung bình của lập trình viên trẻ nhất
    public List<Map.Entry<String, Double>> findCityHasYoungestDev() {
        Map<String, List<Person>> map = filterDeveloperByCity();
        Map<String, Double> cityAverageAge = map.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        entry -> entry.getValue()
                                .stream()
                                .collect(Collectors.averagingInt(Person::getAge))));
        return cityAverageAge.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(1)
                .collect(Collectors.toList());
    }

    //3. Liệt kê tỷ lệ nam/nữ ở từng thành phố
    public Map<String, Double> maleFemaleRatioOnPerCity() {
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getCity))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(p -> p.getKey(), p -> maleFemaleRatio(p.getValue())));
    }

    //4. Tính mức lương trung bình của tất cả những người trên 30 tuổi
    public Double calAvgSalaryPeopleAbove30() {
        return people
                .stream()
                .filter(p -> p.getAge() > 30)
                .collect(Collectors.averagingInt(Person::getSalary));
    }

}
