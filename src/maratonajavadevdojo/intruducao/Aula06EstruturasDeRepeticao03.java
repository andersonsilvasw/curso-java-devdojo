package maratonajavadevdojo.intruducao;

public class Aula06EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 números de um dado valor, ex: 50
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
