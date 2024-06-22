public class StrComparsn {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = new String("HELLO");
        System.out.println("equals : " + str1.equals(str2));
        System.out.println("equals ignore case : " + str1.equalsIgnoreCase(str2));
        System.out.println("equals content : " + str1.contentEquals(str2));


        String st1 = "Hello";
        String st2 = new String("Hello");
        System.out.println("compare to : " + st1.compareTo(st2));


    }
}
