package Academy.devdojo.estruturascondicionais.ifelse;

public class ImparOuPar {
    public static void main(String[] args) {
        int numero = 2;
        if ( (numero % 2) == 0) {
            System.out.println("PAR: " + (numero % 2));
        } else {
            System.out.println("IMPAR: " + (numero % 2));
        }
    }
}