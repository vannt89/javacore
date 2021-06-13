package Example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

//        try {
//            int result = 7 / 0; //ArithmeticException
//            System.out.println(result);
//        } catch (ArithmeticException ex1) {
//            System.out.println("Không thể chia 1 số cho 0");
//        } finally {
//            System.out.println("Khối lệnh này luôn dc thực thi");
//        }
//
//        try {
//            String obj = null;//NullPointerException
//            System.out.println(obj.length());
//        } catch (NullPointerException ex2) {
//            System.out.println("Không thể lấy kích thước của null");
//        }
//
//
//        try {
//            String str = "abc";//NumberFormatException
//            int num = Integer.parseInt(str);
//        } catch (NumberFormatException ex3) {
//            System.out.println("Không thể ép kiểu");
//        }
//
//        try {
//            int arr[] = new int[5];//ArrayIndexOutOfBoundsException
//            arr[5] = 50;
//        } catch (ArrayIndexOutOfBoundsException ex4) {
////            ex4.printStackTrace();
//        }
//
//        try {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Nhập vào số phần tử của mảng: ");
//            int n = scanner.nextInt();
//
//            int arr[] = new int[n];
//            //input -5 -> //NegativeArraySizeException
//            //input -a -> InputMismatchException
//        } catch (NegativeArraySizeException ex5) {
//            System.out.println("Hãy nhập phần tử của mảng là 1 số dương. Error: " + ex5.toString());
//        } catch (InputMismatchException ex6) {
//            System.out.println("Hãy nhập phần tử của mảng là số. Error: " + ex6.getMessage());
//        }

        ExceptionExample exceptionExample = new ExceptionExample();
//        exceptionExample.checkAge(10);

//        ////xử lý ngoại lệ tại đây
//        try {
//            int age = exceptionExample.setAge();
//            System.out.println("Tuổi của nhân viên: " + age);
//        } catch (IOException e) {
//            System.out.println("Tuổi vừa nhập không hợp lệ: " + e.toString());
//        }

        ////Custom exception
        Main main = new Main();
//        try {
//            int age = main.inputAge();
//            System.out.println("Tuổi đã nhập: " + age);
//        } catch (Example.AgeCheckingException e) {
//            System.out.println(e.getMessage());
//        }

        try {
            int weight = main.inputWeight();
            System.out.println("cân nặng đã nhập: " + weight);
        } catch (WeightCheckingException ex8) {
            System.out.println(ex8.getMessage());
        }
    }


    public int inputAge() throws AgeCheckingException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tuổi nhân viên: ");
        int age = 0;
        try {
            age = scanner.nextInt();
            if (age <= 0) throw new AgeCheckingException("tuổi không được <= 0.");
        } catch (InputMismatchException e) {
            throw new AgeCheckingException("tuổi phải là một số.");
        }
        return age;
    }

    ////BT: Custom Exception: nhập cân nặng, ko < 0 và ko nhập chữ
    // nhập vào mã nhân viên(chứng minh thư) bắt buộc có 9 số, nếu nhập ít hơn 9 số, nếu nhập chữ thì báo ra ngoại lệ
    public int inputWeight() throws WeightCheckingException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào cân nặng: ");
        int weight = 0;
        try {
            weight = scanner.nextInt();
            if (weight <= 0) throw new WeightCheckingException("cân nặng không được <= 0.");
        } catch (InputMismatchException e) {
            throw new WeightCheckingException("cân nặng phải là một số.");
        }
        return weight;
    }
}
