package Academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        if (nome.equals("") || nome.equalsIgnoreCase ("admin") || nome.equalsIgnoreCase ("administrador")) {
            System.out.println("Usuario inválido");
        } else {
            System.out.println(nome = "Cadastrado com sucesso");
        }
    }
}
