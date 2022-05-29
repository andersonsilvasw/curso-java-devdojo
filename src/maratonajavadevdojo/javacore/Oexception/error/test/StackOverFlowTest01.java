package maratonajavadevdojo.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        // recursividade(); Errors
        // Comentei a linha acima para o erro não ser lançado
    }

    public static void recursividade() {
        recursividade();
    }
}
