
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class throwsDemo {

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("exception e : " + e);
        }
    }

    public static void readFile() throws IOException {
        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
    }
}
