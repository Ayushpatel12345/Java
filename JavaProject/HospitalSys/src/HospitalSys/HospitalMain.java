package HospitalSys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class HospitalMain {

    private static final String url = "jdbc:mysql://localhost:3306/db_hospital";
    private static final String username = "root";
    private static final String password = "Ayush.9094";

    public static void bookAppointment(Patient patient, Doctor doctor, Connection connection, Scanner scanner){

        System.out.print("Enter Patient Id: ");
        int patientId = scanner.nextInt();
        System.out.print("Enter Doctor Id: ");
        int doctorId = scanner.nextInt();
        System.out.print("Enter appointment date (YYYY-MM-DD): ");
        String appointmentDate = scanner.next();

        if(patient.getPatientById(patientId) && doctor.getDoctorById(doctorId)){
            if(checkDoctorAvailability(doctorId, appointmentDate, connection)){
                String appointmentQuery = "INSERT INTO appointments(patient_id, doctor_id, appointment_date) VALUES(?, ?, ?)";
                try {
                    PreparedStatement preparedStatement = connection.prepareStatement(appointmentQuery);
                    preparedStatement.setInt(1, patientId);
                    preparedStatement.setInt(2, doctorId);
                    preparedStatement.setString(3, appointmentDate);
                    int rowsAffected = preparedStatement.executeUpdate();
                    if(rowsAffected>0){
                        System.out.println("Appointment Booked!");
                    }else{
                        System.out.println("Failed to Book Appointment!");
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }else{
                System.out.println("Doctor not available on this date!!");
            }
        }else{
            System.out.println("Either doctor or patient doesn't exist!!!");
        }
    }

    public static boolean checkDoctorAvailability(int doctorId, String appointmentDate, Connection connection){
        String query = "SELECT COUNT(*) FROM appointments WHERE doctor_id = ? AND appointment_date = ?";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, doctorId);
            preparedStatement.setString(2, appointmentDate);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int count = resultSet.getInt(1);
                if(count==0){
                    return true;
                }else{
                    return false;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            Connection connection = DriverManager.getConnection(url,username,password);

            Patient p1 = new Patient(connection,scanner);
            Doctor d1 = new Doctor(connection);

            while (true){
                System.out.println("----- HOSPITAL MANAGEMENT SYSTEM -----");
                System.out.println("1. Add Patient");
                System.out.println("2. View Patient");
                System.out.println("3. View Doctors");
                System.out.println("4. Book Appointment");
                System.out.println("5. Exit");

                System.out.print("Enter your choice : ");
                int choice = scanner.nextInt();

                switch (choice){
                    case 1 ->  p1.addPatients();
                    case 2 ->  p1.viewPatients();
                    case 3 ->  d1.viewDoctors();
                    case 4 -> bookAppointment(p1,d1,connection,scanner);
                    case 5 -> {return;}
                    case 6 -> System.out.println("hello");
                    default -> System.out.println("Enter valid choice!");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
