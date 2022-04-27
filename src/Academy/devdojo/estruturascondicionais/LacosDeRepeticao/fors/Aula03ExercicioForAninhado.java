package Academy.devdojo.estruturascondicionais.LacosDeRepeticao.fors;

public class Aula03ExercicioForAninhado {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Fazendo a tabuada do número: "+i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " X " + j + " = " +(i*j));
            }
        }
    }
}
