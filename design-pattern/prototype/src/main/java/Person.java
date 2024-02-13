

public class Person  implements Prototype{

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    private Person(Person target) {
        if (target != null) {
            this.name = target.name;
            this.age = target.age;
        }
    }

    @Override
    public Prototype clone() {
        return new Person(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
