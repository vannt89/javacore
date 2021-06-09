public class StringBuilderInJava {

    public static void main(String args[]) {
        StringBuilder str1 = new StringBuilder();
        System.out.println("Dung lượng chuỗi default: " + str1.capacity());
        StringBuilder str2 = new StringBuilder("Hello ");
        StringBuilder str3 = new StringBuilder(50);
        str2.append("Java Alibaba");
        str2.append(1.8);
        str2.append(true);
        System.out.println(str2);
        System.out.println(str2.length());
//        str2.reverse();
//        System.out.println(str2);
        int index = str2.indexOf("a");
        int nextIndex = str2.indexOf("a", index + 1);
        int lastIndex = str2.lastIndexOf("a");
        System.out.println(index);
        System.out.println(nextIndex);
        System.out.println(lastIndex);

        StringBuilder str4 = new StringBuilder("Hello Megan");
        str4.insert(6, "i love you ");
        str4.insert(17, 3000);
        System.out.println(str4);

        str4.replace(0, 5, "Hellu");
        System.out.println(str4);

        str2.delete(3, 7);
        str2.deleteCharAt(3);
        System.out.println(str2);

        String str5 = "Automation Test 999";
        str5 = str5.substring(11);
        System.out.println(str5);

        str5 = str5.substring(1, 3);
        System.out.println(str5);
    }

}
