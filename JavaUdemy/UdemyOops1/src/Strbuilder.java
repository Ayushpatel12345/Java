public class Strbuilder {
    public static void main(String[] args) {

        String helloWorld = "hello" + " world";
        StringBuilder helloWorldBuilder = new StringBuilder("hello" + " world");

        printInformation(helloWorld);
        printInformation(helloWorldBuilder);
    }
    public static void printInformation(String str) {
        System.out.println("string = " + str);
        System.out.println("length = " + str.length());
    }
    public static void printInformation(StringBuilder builder){
        System.out.println("StringBuilder = " + builder);
        System.out.println("length = " + builder.length());
    }
}
