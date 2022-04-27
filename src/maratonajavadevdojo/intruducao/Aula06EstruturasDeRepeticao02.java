package maratonajavadevdojo.intruducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os números pares de 0 até 1000
        for (int i = 2; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}