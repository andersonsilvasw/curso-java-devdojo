package Academy.devdojo.estruturascondicionais.LacosDeRepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("1. Calcular imposto");
            System.out.println("2. Depositar salario");
            System.out.println("3. Sair");
            System.out.println("Escolha a opcao desejada: ");
            opcao = scanner.nextInt();
        }
        System.out.println("Programa encerrado!");
    }
}
