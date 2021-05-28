import java.util.Random;
import java.util.Scanner;

public class BT1 {

    public String getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter address: ");
        String address = scanner.nextLine();

        String info = "I am: " + fullName + "\nI am: " + age + " years old " + "\nMy address is: " + address;
        return info;
    }

    public void printNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);

        if (number > randomNumber) {
            System.out.println("Lớn hơn rồi");
        } else if (number == randomNumber) {
            System.out.println("Bằng nhau kìa");
        } else {
            System.out.println("Nhỏ hơn rồi");
        }
    }

}
