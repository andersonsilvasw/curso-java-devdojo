package exerciciosandersonsilva;

import java.util.Locale;
import java.util.Scanner;

public class CedulasDeDinheiro {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] notas = { 100, 50, 20, 10, 5, 2, 1 };
        int valor = sc.nextInt();

        if (valor > 0 && valor < 1000000) {
            System.out.println(valor);
            for (int nota : notas) {
                int quociente = valor / nota;
                System.out.println(quociente + " nota(s) de R$ " + nota + ",00");
                valor = valor % nota;
            }
        }
        sc.close();
    }
}
