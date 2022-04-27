package maratonajavadevdojo.intruducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Fazer a doação se o salário for maior que 5000
        double salario = 6000;
        //(condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? "Eu vou doar R$500 para o DevDojo" : "Ainda não esotu com condições de doar";
        System.out.println(resultado);
    }
}
