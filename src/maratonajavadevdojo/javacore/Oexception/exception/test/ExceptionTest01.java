package maratonajavadevdojo.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criaNovoArquivo();
    }

    private static void criaNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            // printStackTrace vai mostrar o erro, caso você não saiba solucioná-lo copia o erro e cola no StackOverFlow.
        }
    }
}
