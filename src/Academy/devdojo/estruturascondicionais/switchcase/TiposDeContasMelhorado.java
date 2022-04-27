package Academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class TiposDeContasMelhorado {
    public static void main(String[] args) {
        System.out.println("Olá, Qual o seu tipo de conta?");
        System.out.println("Digite 1 para CONTA CORRENTE");
        System.out.println("Digite 2 para CONTA POUPANÇA");
        System.out.println("Digite 3 para CONTA INVESTIMENTO");
        Scanner scanner = new Scanner(System.in);
        String conta = scanner.next();
        switch (conta) {
            case "1":
                System.out.println("0.02%");
                break;
            case "2":
                System.out.println("0.05%");
                break;
            case "3":
                System.out.println("0.1%");
                break;
            default:
                System.out.println("CONTA INEXISTENTE");
        }
    }
}
