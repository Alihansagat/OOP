package interfaces;

public interface Observable {
    void subscribe(Subscriber s);
    void unsubscribe(Subscriber s);
    void notifySubscribers(models.ResearchPaper paper);
}
