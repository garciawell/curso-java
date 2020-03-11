package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapC {
    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();

        users.put(1, "Roberto");
        users.put(2, "Rafa");
        users.put(3, "Rebeca");

        System.out.println(users.keySet());

        System.out.println(users.values());

        System.out.println(users.entrySet());

        System.out.println(users.containsKey(2));

        System.out.println(users.containsValue("Rebeca"));

        System.out.println(users.get(3));

        for(int key: users.keySet()){
            System.out.println(key);
        }

        for(String value: users.values()){
            System.out.println(value);
        }

        for(Entry<Integer, String> register: users.entrySet()){
            System.out.println(register.getKey());
            System.out.println(register.getValue());
        }
    }
}
