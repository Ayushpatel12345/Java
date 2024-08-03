import java.sql.*;
import java.util.Scanner;

public class BankingMain {
    private static final String url = "jdbc:mysql://localhost:3306/bank_sys";
    private static final String username = "root";
    private static final String password = "Ayush.9094";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Scanner scanner = new Scanner(System.in);
            User user = new User(connection, scanner);
            Accounts accounts = new Accounts(connection, scanner);
            AccountManager accountManager = new AccountManager(connection, scanner);

            String email;
            long account_number;

            while (true) {
                System.out.println("*** welcome banking system ***");

                System.out.println("\n1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");

                System.out.print("Enter your choice : ");
                int choice1 = scanner.nextInt();

                switch (choice1) {
                    case 1:
                        user.register();
                        break;
                    case 2:
                        email = user.login();
                        if (email != null) {

                            System.out.println("\n user logged in!");
                            if (!accounts.account_exist(email)) {

                                System.out.println("\n1. open bank account");
                                System.out.println("2. exit");
                                if (scanner.nextInt() == 1) {
                                    account_number = accounts.open_account(email);
                                    System.out.println("Account Created Successfully");
                                    System.out.println("Your Account Number is: " + account_number);
                                } else {
                                    break;
                                }

                            }
                            account_number = accounts.getAccount_number(email);
                            int choice2 = 0;
                            while (choice2 != 5) {

                                System.out.println("\n1. credit money");
                                System.out.println("2. debit Money");
                                System.out.println("3. check balance");
                                System.out.println("4. log out");
                                System.out.print("enter your choice : ");
                                choice2 = scanner.nextInt();
                                switch (choice2) {
                                    case 1:
                                        accountManager.credit_money(account_number);
                                        break;
                                    case 2:
                                        accountManager.debit_money(account_number);
                                        break;
                                    case 3:
                                        accountManager.getBalance(account_number);
                                        break;
                                    case 4:
                                        break;
                                    default:
                                        System.out.println("enter valid choice!");
                                }
                            }
                        } else {
                            System.out.println("incorrect email or password");
                        }
                    case 3:
                        System.out.println("thank you for using banking system");
                        System.out.println("exiting system!");
                        return;
                    default:
                        System.out.println("enter valid choice");
                        break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}