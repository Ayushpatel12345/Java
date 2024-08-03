package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Main {

    private static final String url = "jdbc:mysql://localhost:3306/home";
    private static final String username = "root";
    private static final String password = "Ayush.9094";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Scanner scanner = new Scanner(System.in);
            User user1 = new User(connection, scanner);

            String email;

            while (true) {
                System.out.println("\n*** welcome banking system ***");
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");

                System.out.print("enter choice : ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        user1.register();
                        break;
                    case 2:
                        email = user1.login();
                        break;
                    case 3 :
                        System.exit(1);
                        break;
                    default:
                        System.out.println("invalid choice");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

