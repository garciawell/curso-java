package fundaments;

import java.util.Date;

public class PrimitiveTypes {
    public static void main(String[] args) {

        byte yearCompany = 23;
        short numberFly = 542;
        int id = 56789;
        long points = 3_234_845_223L;

        float salary = 11_445.44F;
        double saleSaved = 2_991_979_101_01.01;

        boolean vacation = false;

        char status = 'A';

       Date d = new Date();


        System.out.println(d);

        System.out.println(yearCompany * 365);

        System.out.println(numberFly / 2);

        System.out.println(points / saleSaved);

        System.out.println(salary + id);
    }
}
