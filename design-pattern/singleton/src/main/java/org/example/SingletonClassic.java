package org.example;

import java.util.ArrayList;
import java.util.List;

public class SingletonClassic {

    private static SingletonClassic singletonClassic;
    private final List<User> users = new ArrayList<>();

    private SingletonClassic() {}

    public static SingletonClassic getSingletonClassic() {

        if (singletonClassic == null) {
            return singletonClassic = new SingletonClassic();
        }

        return singletonClassic;
    }

    public void addUsers(User user) {
        users.add(user);
    }

    public void removerUser(User user) {
        users.remove(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
