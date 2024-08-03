import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ImgHandle {
    public static void main(String[] args){

        String url = "jdbc:mysql://localhost:3306/img_db";
        String username = "root";
        String password = "Ayush.9094";
        String img_path = "/home/ayush/Pictures/IMG-201.jpg";
        String query = "insert into img_table(image_data) values(?)";

        try{
            Connection conn = DriverManager.getConnection(url,username,password);
            FileInputStream fileInputStream = new FileInputStream(img_path);
            byte[] imgData = new byte[fileInputStream.available()];
            fileInputStream.read(imgData);

            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setBytes(1,imgData);
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0){
                System.out.println("image inserted successfully");
            }else {
                System.out.println("image not inserted successfully");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
