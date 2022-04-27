package Academy.devdojo.estruturascondicionais.switchcase;

public class TiposDeContas {
    public static void main(String[] args) {
        String conta = "CONTA CORRENTE";
        switch (conta) {
            case "CONTA CORRENTE":
                System.out.println("0.02%");
                break;
            case "CONTA POUPANCA":
                System.out.println("0.05%");
                break;
            case "CONTA INVESTIMENTO":
                System.out.println("0.1%");
                break;
            default:
                System.out.println("CONTA INEXISTENTE");

        }
    }
}
