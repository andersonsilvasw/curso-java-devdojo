package exerciciosandersonsilva;

import java.util.Scanner;

public class Aula04Triangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do triangulo");
        int lado01 = scanner.nextInt();
        System.out.println("Digite o segundo lado do triangulo");
        int lado02 = scanner.nextInt();
        System.out.println("Digite o terceiro lado do triangulo");
        int lado03 = scanner.nextInt();
        if (lado01 == lado02 && lado02 == lado03) {
            System.out.println("O triangulo é equilátero");
        } else if (lado01 != lado02 && lado02 != lado03 && lado01 != lado03) {
            System.out.println("O triangulo é escaleno");
        } else if (lado01 == lado02 || lado02 == lado03 || lado01 == lado03) {
                System.out.println("O triangulo é isósceles");
        }
    }
}

