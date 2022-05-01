package maratonajavadevdojo.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private  double[] salaries;
    private double average;

    public void printt(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        if (salaries == null) {
            return;
        }
       for(double salary: salaries){
           System.out.print("Salary: " +salary+ "  ");
       }
      printaveragesalaries();
    }
    public void printaveragesalaries(){
        if (salaries == null){
            return;
        }
        for(double salary: salaries){
            average += salary;
        }
        average /= salaries.length;
        System.out.println("\nAverage wage: "+ average);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalaries(double[] salaries) {
        this.salaries = salaries;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double[] getSalaries() {
        return salaries;
    }

    public double getMedia() {
        return average;
    }
}
