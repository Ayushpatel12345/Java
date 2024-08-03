package HospitalSys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class Patient {
    private Connection connection;
    private Scanner scanner;

    Patient(Connection connection,Scanner scanner){
        this.connection = connection;
        this.scanner = scanner;
    }

    public void addPatients(){
        scanner.nextLine();
        System.out.print("enter patient name : ");
        String name = scanner.nextLine();
        System.out.print("enter patient age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("enter patient gender : ");
        String gender = scanner.nextLine();

        try {
            String query = "insert into patients(name,age,gender) values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,age);
            preparedStatement.setString(3,gender);

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0){
                System.out.println("patient added successfully");
            }else {
                System.out.println("failed");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void viewPatients(){

        try {
            String query = "select * from patients";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String gender = resultSet.getString("gender");
                System.out.println(id + "   " + name + "   " + age + "   " + gender);

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean getPatientById(int id){
        try {
            String query = "select * from patients where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
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
