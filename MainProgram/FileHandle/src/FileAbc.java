import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileAbc {
    public static void main(String[] args) throws IOException {

        /* ----- file writer ----- */
        FileWriter fw = new FileWriter("src/FileAbc.txt");     // create file = "src/FileAbc.txt"
        fw.write("hello friend , good morning");                   // str show in FileAbc.txt file
        fw.close();

        /* ----- file reader ----- */
        FileReader fr = new FileReader("src/FileAbc.txt");
        System.out.println(fr.read());                                 //  below run in show


    }
}
