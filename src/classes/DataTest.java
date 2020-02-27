package classes;

public class DataTest {
    public static void main(String[] args) {
       Data date = new Data();
       date.day = 12;
       date.month = 02;
       date.year = 2018;

        System.out.printf("%d/%d/%d", date.day,date.month,date.year);

    }
}
