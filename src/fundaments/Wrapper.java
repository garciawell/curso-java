package fundaments;

public class Wrapper {
    public static void main(String[] args) {
        Byte b = 1;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        String c = "#";

        System.out.println(c);

        Float f = 123.0F;
        System.out.println(f);

        Double d = 12313.45;
        System.out.println(d);
    }
}
