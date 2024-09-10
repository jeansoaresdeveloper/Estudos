import java.util.List;

public interface Observable {

    void subscribe(final List<Observer> observer);

    void unsubscribe(final Observer observer);

    void notifyObservers();

}
