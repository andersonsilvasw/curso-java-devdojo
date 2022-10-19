package exerciciosandersonsilva;

import java.util.Locale;
import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[] notas = { 100, 50, 20, 10, 5, 2 };
        double[] moedas = { 1, 0.50, 0.25, 0.10, 0.05, 0.01 };
        double valor = sc.nextDouble();

        if (valor >= 0 && valor <= 1000000.00) {
            System.out.println("NOTAS:");
            for (double nota : notas) {
                int quociente = (int) (valor / nota);
                System.out.printf(quociente + " nota(s) de R$ %.2f\n", nota);
                valor = valor % nota;
            }
            System.out.println("MOEDAS:");
            for (double moeda : moedas) {
                int quociente = (int) (valor / moeda);
                System.out.printf(quociente + " moeda(s) de R$ %.2f\n", moeda);
                valor = valor % moeda;
            }
        }
        sc.close();
    }
}
