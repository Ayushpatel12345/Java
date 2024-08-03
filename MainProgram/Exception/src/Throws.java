import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;

public class Throws {

    //method
    public static void myFiles() throws FileNotFoundException {
        FileReader f1 = new FileReader("pqr.txt");
        System.out.println(f1);
    }

    public static void main(String[] args) {

        try {
            myFiles();
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
