package collections;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User u1= new User("ANA");
        list.add(u1);
        list.add(new User("Bia"));
        list.add(new User("Pedro"));
        list.add(new User("Carlos"));

        System.out.println(list.get(2));

        System.out.println(">> Tem?" + list.remove(2));
        System.out.println("Tem?" + list.remove(new User("ANA")));

        System.out.println("CONTAIN ? " + list.contains(new User("Pedro")));

        for(User u: list) {
            System.out.println(u.name);
        }
    }
}
