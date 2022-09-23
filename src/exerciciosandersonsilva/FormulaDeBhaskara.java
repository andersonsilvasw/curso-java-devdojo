package exerciciosandersonsilva;

import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B: ");
        int b = scanner.nextInt();
        System.out.println("Digite o valor de C: ");
        int c = scanner.nextInt();

        int delta = (b * b) - 4 * a * c;
        System.out.println("O valor do delta é: " + delta);
        System.out.println();

        int x1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
        System.out.println("O valor de X1 é: " + x1);
        System.out.println();
        int x2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
        System.out.println("O valor de X2 é: " + x2);
        scanner.close();
    }
}
