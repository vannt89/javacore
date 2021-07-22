import controller.PersonRepository;

public class Main {

    public static void main(String args[]){
        PersonRepository personRepository = new PersonRepository();
        personRepository.getAll();
    }

}
