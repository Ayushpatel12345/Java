import java.util.Scanner;

public class scanner {

        public static void main(String[] args){

            int currentYear = 2024;
            System.out.println(getInputScanner(currentYear));
        }
        public static String getInputScanner(int currentYear){

            Scanner sc = new Scanner(System.in);

            System.out.println("hi,whats's your name:");
            String name = sc.nextLine();
            System.out.println("hi " + name +", thanks for this course");

           System.out.println("where your born:");
           String dateOfBirth = sc.nextLine();
           int age = currentYear - Integer.parseInt(dateOfBirth);

           return "so you are "+ age +" years old";
        }
}

