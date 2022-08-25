package maratonajavadevdojo.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criaNovoArquivo();
    }

    private static void criaNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            // printStackTrace vai mostrar o erro, caso você não saiba solucioná-lo copia o erro e cola no StackOverFlow.
            throw e;
        }
    }
}
