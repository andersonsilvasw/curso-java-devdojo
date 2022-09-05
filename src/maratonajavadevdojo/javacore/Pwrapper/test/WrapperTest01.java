package maratonajavadevdojo.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {

        // Tipos primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 100;
        char charP = 'W';
        boolean bolleanP = false;

        // Classes wrappers
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // autoboxing (Vai de um tipo primitivo para Wrapper)
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean bolleanW = false;

        int i = intW; // unboxing (De wrapper para Tipo primitivo)
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("truE");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
