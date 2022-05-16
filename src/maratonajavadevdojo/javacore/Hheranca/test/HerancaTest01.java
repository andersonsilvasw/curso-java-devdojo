package maratonajavadevdojo.javacore.Hheranca.test;

import maratonajavadevdojo.javacore.Hheranca.dominio.Endereço;
import maratonajavadevdojo.javacore.Hheranca.dominio.Funcionario;
import maratonajavadevdojo.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        endereço.setRua("Rua 3");
        endereço.setCep("012345-00");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("012.345.678-99");
        pessoa.setEndereço(endereço);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("222.222.222-00");
        funcionario.setEndereço(endereço);
        funcionario.setSalario(20000);
        System.out.println("----------------------------------");

        funcionario.imprime();
    }
}
