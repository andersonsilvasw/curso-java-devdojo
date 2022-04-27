package Academy.devdojo.estruturascondicionais.LacosDeRepeticao.whiles;

import java.util.Scanner;

public class Aula02ExercicioImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Olá, Digite um número: ");
        int i = 0;
        int valorFinal = scanner.nextInt();
        while (i <= valorFinal) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
            i = i + 1;
        }
    }
}
