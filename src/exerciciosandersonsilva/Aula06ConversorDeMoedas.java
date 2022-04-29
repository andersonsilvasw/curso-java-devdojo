package exerciciosandersonsilva;

import java.util.Scanner;

public class Aula06ConversorDeMoedas {
    public static void main(String[] args) {
        System.out.println("Qual o valor em dolares para converter? ");
        Scanner scanner = new Scanner(System.in);
        double dollar = scanner.nextDouble();
        double reais = (dollar * 5.25);
        System.out.println("O valor convertido para reais é de: " + reais);
    }
}
