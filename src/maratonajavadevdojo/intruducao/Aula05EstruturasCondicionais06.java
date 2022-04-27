package maratonajavadevdojo.intruducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        /* Utilizando switch e dados os valores de 1 a 7, Imprima se é dia útil ou fim de semana */
        // Considerando 1 como Domingo //
        byte dia = 1;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
