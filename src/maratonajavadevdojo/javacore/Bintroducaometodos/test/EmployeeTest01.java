package maratonajavadevdojo.javacore.Bintroducaometodos.test;

import maratonajavadevdojo.javacore.Bintroducaometodos.dominio.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee funcionario = new Employee();
        funcionario.name = "Sanji";
        funcionario.age = 23;
        funcionario.salaries = new double[]{1200 ,987.32, 2000};

        funcionario.printt();
    }
}
