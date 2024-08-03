import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public static void main(String[] args) throws IOException {

        File f1 = new File("src/CreateFile2.txt");
        if (f1.delete()) {
            System.out.println("delete file : " + f1.getName());
        } else {
            System.out.println("failed to delete file");
        }


    }
}
