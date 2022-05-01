package maratonajavadevdojo.javacore.Bintroducaometodos.test;

import maratonajavadevdojo.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setName("Sanji");
        funcionario.setAge(23);
        funcionario.setSalaries(new double[]{1200 ,987.32, 2000});
        funcionario.printt();
        System.out.println("Média: " + funcionario.getMedia());
    }
}
