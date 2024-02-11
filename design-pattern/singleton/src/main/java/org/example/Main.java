package org.example;


public class Main {
    public static void main(String[] args) {

        SingletonClassic singletonClassic =
                SingletonClassic.getSingletonClassic();

        SingletonClassic singletonClassic2 =
                SingletonClassic.getSingletonClassic();

        User jean = new User("Jean", 12);
        singletonClassic.addUsers(jean);
        singletonClassic.addUsers(new User("Rhayssa", 13));

        singletonClassic2.addUsers(new User("Cassia", 15));

        System.out.println(singletonClassic.getUsers());
    }
}