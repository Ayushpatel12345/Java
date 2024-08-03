package Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class User{
    private Connection connection;
    private Scanner scanner;

    public User(Connection connection,Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
    }

    public void register(){
        scanner.nextLine();
        System.out.print("enter name : ");
        String name = scanner.nextLine();
        System.out.print("enter email : ");
        String email = scanner.nextLine();
        System.out.print("enter password : ");
        String password = scanner.nextLine();

        if (user_exist(email)){
            System.out.println("user already exists for this email address");
            return;
        }
        String register_query = "insert into user(name,email,password) values(?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(register_query);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,email);
            preparedStatement.setString(3,password);
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0){
                System.out.println("registration successfully");
            }else{
                System.out.println("registration not successfully");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String login(){
        scanner.nextLine();
        System.out.print("enter email : ");
        String email = scanner.nextLine();
        System.out.print("enter password : ");
        String password = scanner.nextLine();

        String login_query = "select * from user where email = ? AND password = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(login_query);
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                System.out.println("login successfully");
                return email;
            }else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public boolean user_exist(String email){
        String query = "select * from user where email = ?";
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,email);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return true;
            }else {
                return false;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
