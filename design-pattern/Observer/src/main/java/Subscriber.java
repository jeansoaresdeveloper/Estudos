public class Subscriber implements Observer {

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String latestBook) {
        System.out.println("Olá " + name + "! Novo livro disponível " + latestBook);
    }
}
