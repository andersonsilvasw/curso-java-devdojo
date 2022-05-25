package maratonajavadevdojo.javacore.Npolimorfismo.test;

import maratonajavadevdojo.javacore.Npolimorfismo.dominio.Computador;
import maratonajavadevdojo.javacore.Npolimorfismo.dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
    }
}
