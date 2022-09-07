package maratonajavadevdojo.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        // A classe date é ultrapassada, apenas para manter o legado
        Date date = new Date(1662578657544L);
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
