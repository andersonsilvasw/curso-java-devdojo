package maratonajavadevdojo.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter br = BufferedWriter(fw)) {
            br.write("O melhor curso do Brasillllll\nContinuando na próxima linha");
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
