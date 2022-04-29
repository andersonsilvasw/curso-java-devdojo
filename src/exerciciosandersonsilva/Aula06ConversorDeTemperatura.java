package exerciciosandersonsilva;

import java.util.Scanner;

public class Aula06ConversorDeTemperatura {
    public static void main(String[] args) {
        System.out.println("Qual a temperatura em Farenheit para converter?");
        Scanner scanner = new Scanner (System.in);
        double farenheit = scanner.nextDouble();
        double celsius = (farenheit - 32) / 1.8;
        System.out.println("A temperatura em graus celsius é: " + celsius);
    }
}
