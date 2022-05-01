package maratonajavadevdojo.javacore.Bintroducaometodos.test;

import maratonajavadevdojo.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.name = "Sanji";
        funcionario.age = 23;
        funcionario.salaries = new double[]{1200 ,987.32, 2000};

        funcionario.printt();
    }
}
