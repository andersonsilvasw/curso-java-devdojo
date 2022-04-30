package maratonajavadevdojo.javacore.Bintroducaometodos.dominio;

public class Employee {
    public String name;
    public  int age;
    public  double[] salaries;

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
        double average = 0;
        for(double salary: salaries){
            average += salary;
        }
        average /= salaries.length;
        System.out.println("\nAverage wage: "+ average);
    }
}
