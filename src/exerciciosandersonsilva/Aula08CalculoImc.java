package exerciciosandersonsilva;

import java.util.Scanner;

public class Aula08CalculoImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu peso: (KG)");
        double massa = scanner.nextDouble();
        System.out.println("Digite a sua altura: (MT");
        double altura = scanner.nextDouble();
        double imc = massa / (altura * altura);
        System.out.println("Seu IMC é: " +imc);
            if (imc < 17) {
                System.out.println("Muito abaixo do peso");
            } else if (imc >= 17 && imc < 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc >= 18.5 && imc < 25) {
                System.out.println("Peso ideal");
            } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
            } else if (imc >= 30 && imc < 35) {
                System.out.println("Obesidade");
            } else if (imc >= 35 && imc < 40) {
                System.out.println("Obesidade sévera");
            } else {
                System.out.println("Obesidade mórbida");
            }
    }
}
