package maratonajavadevdojo.javacore.Oexception.exception.test;

import maratonajavadevdojo.javacore.Oexception.exception.dominio.Funcionario;
import maratonajavadevdojo.javacore.Oexception.exception.dominio.LoginInvalidoException;
import maratonajavadevdojo.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
