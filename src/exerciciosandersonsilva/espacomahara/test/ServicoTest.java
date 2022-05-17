package exerciciosandersonsilva.espacomahara.test;

import exerciciosandersonsilva.espacomahara.dominio.Servico;

public class ServicoTest {
    public static void main(String[] args) {
        Servico servico = new Servico(1, "Escova" ,"01/05/2022" ,"01/05/2022" ,35,"PIX", "Sem observação");
        servico.imprime();
    }
}
