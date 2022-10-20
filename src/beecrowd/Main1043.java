package beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Main1043 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double areaTrapezio;
        double perimetro;
        double ladoA = sc.nextDouble();
        double ladoB = sc.nextDouble();
        double ladoC = sc.nextDouble();

        if ((ladoA + ladoB) > ladoC && (ladoA + ladoC) > ladoB && (ladoB + ladoC) > ladoA) {
            perimetro = ladoA + ladoB + ladoC;
            System.out.println("Perimetro = " + perimetro);
        } else {
            areaTrapezio = (ladoA + ladoB) * ladoC / 2;
            System.out.println("Area = " + areaTrapezio);
        }
        sc.close();
    }
}
