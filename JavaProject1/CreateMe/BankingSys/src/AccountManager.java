import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class AccountManager {

    private Connection connection;
    private Scanner scanner;

    public AccountManager(Connection connection,Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
    }

    public void credit_money(long account_number) throws SQLException {
        System.out.print("enter amount : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("enter security pin : ");
        String security_pin = scanner.nextLine();

        try{
            connection.setAutoCommit(false);
            if (account_number != 0){
                PreparedStatement preparedStatement = connection.prepareStatement("select * from accounts where account_number = ? and security_pin = ?");
                preparedStatement.setLong(1,account_number);
                preparedStatement.setString(2,security_pin);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()){
                    String credit_query = "update accounts set balance =  balance + ? where account_number = ?";
                    PreparedStatement preparedStatement1 = connection.prepareStatement(credit_query);
                    preparedStatement1.setDouble(1,amount);
                    preparedStatement1.setDouble(2,account_number);
                    int rowsAffected = preparedStatement1.executeUpdate();
                    if (rowsAffected > 0){
                        System.out.println("Rs."+amount+" credited successfully");
                        connection.commit();
                        connection.setAutoCommit(true);
                        return;
                    }else {
                        System.out.println("transaction failed!");
                        connection.rollback();
                        connection.setAutoCommit(true);
                    }
                }else {
                    System.out.println("invalid security pin!");
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        connection.setAutoCommit(true);
    }

    public void debit_money(long account_number) throws SQLException {
        scanner.nextLine();
        System.out.print("enter amount : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("enter security pin : ");
        String security_pin = scanner.nextLine();
        
        try {
            connection.setAutoCommit(false);
            if (account_number != 0){
                PreparedStatement preparedStatement = connection.prepareStatement("select * from accounts where account_number = ? and security_pin = ?");
                preparedStatement.setLong(1,account_number);
                preparedStatement.setString(2,security_pin);
                ResultSet resultSet  = preparedStatement.executeQuery();

                if (resultSet.next()){
                    double current_balance = resultSet.getDouble("balance");
                    if (amount<=current_balance){
                        String debit_query = "update accounts set balance = balance - ? where account_number = ?";
                        PreparedStatement preparedStatement1 = connection.prepareStatement(debit_query);
                        preparedStatement1.setDouble(1,amount);
                        preparedStatement1.setLong(2,account_number);
                        int rowsAffected = preparedStatement1.executeUpdate();
                        if (rowsAffected > 0){
                            System.out.println("Rs."+amount+" debited successfully");
                            connection.commit();
                            connection.setAutoCommit(true);
                            return;
                        }else {
                            System.out.println("transaction failed!");
                            connection.rollback();
                            connection.setAutoCommit(true);
                        }
                    }else {
                        System.out.println("insufficient balance!");
                    }
                }else {
                    System.out.println("invalid pin!");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        connection.setAutoCommit(true);
    }

    public void getBalance(long account_number) throws SQLException{
        scanner.nextLine();
        System.out.print("enter security pin : ");
        String security_pin = scanner.nextLine();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("select balance from accounts where account_number = ? and security_pin = ?");
            preparedStatement.setLong(1,account_number);
            preparedStatement.setString(2,security_pin);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                double balance = resultSet.getDouble("balance");
                System.out.println("balance : " + balance);
            }else {
                System.out.println("invalid pin!");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
