package maratonajavadevdojo.javacore.Npolimorfismo.test;

import maratonajavadevdojo.javacore.Npolimorfismo.repositorio.Repositorio;
import maratonajavadevdojo.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        // new Repositorio poderia ser em qualquer um dos três (banco de dados, arquivo ou memória), sé se altera aí mesmo.
        repositorio.salvar();
    }
}
