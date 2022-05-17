package exerciciosandersonsilva;

import java.util.Scanner;

public class Aula07ParOuImpar {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if (numero <= 0) {
            System.out.println("O número digitato não é válido, tente novamente");
        } else if ((numero % 2) == 1) {
            System.out.println("o número digitado é Ímpar");
        } else if ((numero % 2) == 0) {
            System.out.println("O número digitado é Par");
        }
    }
}

