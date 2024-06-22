import java.io.FileReader;

public class Throws {

    //method
    public static void myFiles() throws Exception{
        FileReader f1 = new FileReader("pqr.txt");
    }

    public static void main(String[] args) throws Exception {
        myFiles();
    }
}
