import java.io.*;

public class BufferXyz {
    public static void main(String[] args) throws IOException {

        /* ----- Buffer Writer ----- */
        FileWriter fw = new FileWriter("src/BufferXyz.txt");  // create file = "src/FileAbc.txt"
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("hi i am coding sir,written directly");           // str show in BufferXyz.txt file
        bw.close();

        /* ----- Buffer Reader ----- */
        FileReader fr = new FileReader("src/BufferXyz.txt");
        BufferedReader bf = new BufferedReader(fr);
        System.out.println(bf.readLine());                              // below run in show
    }
}
