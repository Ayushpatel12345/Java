import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {

        File f1 = new File("src/CreateFile1.txt");
        if (f1.createNewFile()) {
            System.out.println("file created : " + f1.getName());
        } else {
            System.out.println("file already exists");
        }

        File f2 = new File("src/CreateFile2.txt");
        if (f2.createNewFile()){
            System.out.println("file created : " + f2.getName());
        }else {
            System.out.println("file already exits");
        }
    }
}
