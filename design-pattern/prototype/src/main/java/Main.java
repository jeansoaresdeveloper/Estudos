

public class Main {
    public static void main(String[] args) {

        Person jean = new Person("Jean", 12);
        Prototype clone = jean.clone();

        System.out.println(jean);
        System.out.println(clone);


    }
}
