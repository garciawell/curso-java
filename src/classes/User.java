package classes;

import java.util.Objects;

public class User {
    String name;
    String email;

    public boolean equals(Object obj) {
        User other = (User) obj;

        if(obj instanceof User) {
        boolean nameEqual = other.name.equals(this.name);
        boolean emailEqual = other.email.equals(this.email);

        return nameEqual && emailEqual;
        } else {
            return false;
        }
    }

}
