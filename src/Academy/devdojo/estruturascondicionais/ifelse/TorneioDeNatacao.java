package Academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class TorneioDeNatacao {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o seu nome: ");
        String nome = input.next();
        System.out.println("Digite a sua idade: ");
        int idade = input.nextInt();
        if (idade < 11) {
            System.out.println(nome + " participara da categoria Infantil");
        } else if (idade > 10 && idade < 16) {
            System.out.println(nome + " participara da categoria Juvenil");
        } else if (idade > 15 && idade < 20) {
            System.out.println(nome + " participara da categoria Pré-adulto");
        } else {
            System.out.println(nome + " participara da categoria Adulto");
        }
    }
}
