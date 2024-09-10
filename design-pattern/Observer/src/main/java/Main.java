import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book = new Book();

        Observer subscriberUm = new Subscriber("Jean");
        Observer subscriberDois = new Subscriber("Rhayssa");
        Observer subscriberTres = new Subscriber("Cassia");

        book.subscribe(List.of(subscriberUm, subscriberDois, subscriberTres));

        book.publishNewBook("O pequeno Principe");

        book.unsubscribe(subscriberTres);

        book.publishNewBook("Design Patterns");

    }

}
