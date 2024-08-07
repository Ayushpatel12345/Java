import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
    public static void main(String[] args) throws IOException {

         File myObj = new File("src/filename.txt");
           if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
         } else {
             System.out.println("File already exists.");
         }
    }
}