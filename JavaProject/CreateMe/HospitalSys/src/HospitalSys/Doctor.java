package HospitalSys;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Doctor {
    private Connection connection;


    Doctor(Connection connection){
        this.connection = connection;
    }

    public void viewDoctors(){

        try {
            String query = "select * from doctors";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String specialization = resultSet.getString("specialization");
                System.out.println(id + "  " + name + "  " + specialization );
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean getDoctorById(int id){
        try {
            String query = "select * from doctors where id = ?";
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
