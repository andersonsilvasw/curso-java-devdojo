package maratonajavadevdojo.javacore.Lclassesabstratas.test;

import maratonajavadevdojo.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import maratonajavadevdojo.javacore.Lclassesabstratas.dominio.Funcionario;
import maratonajavadevdojo.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
