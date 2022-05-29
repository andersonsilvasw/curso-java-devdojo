package maratonajavadevdojo.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();
        // Errors
    }

    public static void recursividade() {
        recursividade();
    }
}
