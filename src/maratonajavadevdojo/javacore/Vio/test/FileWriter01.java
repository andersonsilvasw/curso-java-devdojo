package maratonajavadevdojo.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file)) {
            fw.write("O melhor curso do Brasillllll\nContinuando na próxima linha");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
