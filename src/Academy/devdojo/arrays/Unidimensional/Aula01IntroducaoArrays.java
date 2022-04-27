package Academy.devdojo.arrays.Unidimensional;

public class Aula01IntroducaoArrays {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 3;
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média das notas eh: " +media);
        double[] notas = new double[4];
        System.out.println("-------------------------------------");
        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 3.0;
        notas[3] = 6.0;
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);
    }
}
