package maratonajavadevdojo.javacore.Aintroducaoclasses.test;

import maratonajavadevdojo.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

       // Referência de onjetos: fazendo carro1 imprimir igual ao carro2, só funciona se for da mesma classe.
        // carro1 = carro2;

        carro1.nome = "Nissan March";
        carro1.modelo = "SL CVT 1.6";
        carro1.ano = 2016;

        carro2.nome = "Chevrolet Onix";
        carro2.modelo = "Joy";
        carro2.ano = 2018;

        System.out.println("Nome: " +carro1.nome+ ", Modelo: " +carro1.modelo+ ", Ano: " +carro1.ano);
        System.out.println("Nome: " +carro2.nome+ ", Modelo: " +carro2.modelo+ ", Ano: " +carro2.ano);
    }
}
