public class Customer {

    private static final String NOT_DIGITS = "\\D";

    private final String name;

    private final String age;

    private String cpf;

    public Customer(String name, String age, String cpf) {
        this.name = name;
        this.age = age;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getCpf() {
        return cpf;
    }

    public void cleanCpf() {
        cpf = cpf.replaceAll(NOT_DIGITS, "");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
