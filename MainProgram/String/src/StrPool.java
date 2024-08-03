public class StrPool {
    public static void main(String[] args) {

//         1st method
//        String str1 = "Hello";
//        String str2 = "Hello";

//        2nd method
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1==str2);   //1st & 2nd method

        String st1 = "hello";
        st1.concat("world");
        System.out.println("string immutable : " + st1);
    }
}
