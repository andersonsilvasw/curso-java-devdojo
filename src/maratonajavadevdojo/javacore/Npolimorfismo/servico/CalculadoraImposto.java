package maratonajavadevdojo.javacore.Npolimorfismo.servico;

import maratonajavadevdojo.javacore.Npolimorfismo.dominio.Computador;
import maratonajavadevdojo.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Realatório de imposto do Computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador " +computador.getNome());
        System.out.println("Valor " +computador.getValor());
        System.out.println("Imposto a ser pago " +imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Realatório de imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Computador " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }
}
