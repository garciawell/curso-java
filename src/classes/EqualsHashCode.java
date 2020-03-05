package classes;

public class EqualsHashCode {
    public static void main(String[] args) {
        User u1 = new User();
        u1.name = "Wellington";
        u1.email = "garciawell@gmail.com";

        User u2 = new User();
        u2.name = "Wellington";
        u2.email = "garciawell@gmail.com";

        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));


    }
}
