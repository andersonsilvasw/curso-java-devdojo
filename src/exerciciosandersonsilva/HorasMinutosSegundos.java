package exerciciosandersonsilva;

import java.util.Locale;
import java.util.Scanner;

public class HorasMinutosSegundos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int horas = tempo / 3600;
        int minutos = (tempo - horas * 3600) / 60;
        int segundos = tempo - (horas * 3600) - (minutos * 60);

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
