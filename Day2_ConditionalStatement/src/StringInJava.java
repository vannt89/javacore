public class StringInJava {

    public static void main(String args[]) {
        String myName = "Nguyen Thi Van  ";

        //implicit cast, ngầm add toString()
        System.out.println("Độ dài chuỗi là: " + myName.length());
        System.out.println("Chuỗi sau khi xoá khoảng trắng là: " + myName.trim());
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());
        System.out.println("Vị trí của n là: " + myName.indexOf('n'));
        System.out.println("Kí tự có index 11 là:" + myName.charAt(11));
        System.out.println("Replace = " + myName.replace("Van", "Van kute"));
        System.out.println("first name = " + myName.substring(0,6));
        System.out.println("last name = " + myName.substring(11));
        System.out.println("Vị trí chữ n thứ 2 = " + myName.indexOf('n', 5));

        //equals dùng để so sánh đối tượng
        // == để so sánh nguyên thuỷ
        String str1 = "Test";
        String str2 = "Test";
        System.out.println(str1 == str2); //true
        System.out.println(str1.equals(str2));  //true

        String s1 = new String("Test");
        String s2 = new String("Test");

        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true


    }

}
