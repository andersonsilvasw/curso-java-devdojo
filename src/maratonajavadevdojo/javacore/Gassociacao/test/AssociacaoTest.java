package maratonajavadevdojo.javacore.Gassociacao.test;

import maratonajavadevdojo.javacore.Gassociacao.dominio.Aluno;
import maratonajavadevdojo.javacore.Gassociacao.dominio.Local;
import maratonajavadevdojo.javacore.Gassociacao.dominio.Professor;
import maratonajavadevdojo.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local ("Rua das Laranjeiras");
        Aluno aluno = new Aluno("Luffy", 30);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
