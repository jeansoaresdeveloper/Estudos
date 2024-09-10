import java.util.ArrayList;
import java.util.List;

public class Book implements Observable {

    private final List<Observer> observers = new ArrayList<Observer>();

    private String latestBook;

    @Override
    public void subscribe(List<Observer> observers) {
        this.observers.addAll(observers);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.removeIf(obs -> obs.equals(observer));
    }

    @Override
    public void notifyObservers() {
        observers.forEach(obs -> obs.update(latestBook));
    }

    public void publishNewBook(String newBook) {
        latestBook = newBook;
        notifyObservers();
    }
}
