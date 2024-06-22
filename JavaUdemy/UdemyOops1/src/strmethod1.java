public class strmethod1 {
    public static void main(String[] args) {
        printInformation("hello world");
        printInformation("");
        printInformation("   ");

        String str1 = "hello world";
        System.out.printf("indexOf r : %d\n",str1.indexOf('l'));
        System.out.printf("last indexOf r : %d",str1.lastIndexOf('l'));
    }

    public static void printInformation(String str){
        int len = str.length();
        System.out.printf("length : %d\n",len);

        if (str.isEmpty()){
            System.out.println("string is empty");
            return;
        }

        if (str.isBlank()){
            System.out.println("string is blank");
        }

        System.out.printf("charAt : %c\n",str.charAt(0));

        System.out.printf("charAt : %c\n",str.charAt(len-1));

    }
}
