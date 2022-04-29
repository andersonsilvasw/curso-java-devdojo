package exerciciosandersonsilva;

import java.util.Scanner;

public class Aula08CriancaEsperanca {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("         CRIANÇA ESPERANÇA         ");
        System.out.println("-----------------------------------");
        System.out.println("     MUITO OBRIGADO POR AJUDAR     ");
        System.out.println(" [1] PARA DOAR R$10");
        System.out.println(" [2] PARA DOAR R$25");
        System.out.println(" [3] PARA DOAR R$50");
        System.out.println(" [4] PARA DOAR OUTRO VALOR");
        System.out.println(" [5] PARA CANCELAR");
        Scanner digito = new Scanner(System.in);
        int doacao = digito.nextInt();
        switch (doacao) {
            case 1:
                System.out.println("SUA DOAÇÃO FOI DE R$ "+doacao);
                System.out.println("MUITO OBRIGADO");
                break;
            case 2:
                System.out.println("SUA DOAÇÃO FOI DE R$ "+doacao);
                System.out.println("MUITO OBRIGADO");
                break;
            case 3:
                System.out.println("SUA DOAÇÃO FOI DE R$ "+doacao);
                System.out.println("MUITO OBRIGADO");
                break;
            case 4:
                System.out.println("QUAL O VALOR QUE VOCÊ DESEJA DOAR?");
                Scanner scanner = new Scanner(System.in);
                double doacaoOutroValor = scanner.nextDouble();
                System.out.println("SUA DOAÇÃO FOI DE R$ "+doacaoOutroValor);
                System.out.println("MUITO OBRIGADO");
                break;
            case 5:
                System.out.println("VOCÊ OPTOU POR NÃO DOAR DESSA VEZ, OBRIGADO MESMO ASSIM");
                break;
            default:
                System.out.println("DÍGITO INVÁLIDO, TENTE NOVAMENTE");
        }
    }
}
