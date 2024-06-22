public class textformat {
    public static void main(String[] args) {

//        String bullet = "print bullent list:\n" +
//                "\t\u2022 first point\n" +
//                "\t\t\u2022 sub point";
//        System.out.println(bullet);
//
//        String textFormat= """
//                print bullet list:
//                    \u2022 first point
//                        \u2022 sub point """;
//        System.out.println(textFormat);

        int age = 35;
        System.out.printf("age = %d\n",age);

        int yearOfBirth = 2023 - age;
        System.out.printf("age = %d,birth year = %d\n" ,age,yearOfBirth);

        System.out.printf("age %.2f\n",(float) age);

        for(int i = 1; i<=10000 ; i*=10){
            System.out.printf("printing %d\n" , i);
        }

        String formatString = String.format("your age is:%d",age);
        System.out.println(formatString);


    }
}
