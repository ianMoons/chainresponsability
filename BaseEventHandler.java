public class BaseEventHandler implements EventHandler {
    private EventHandler successor;
    public void setNext(EventHandler successor) {
        this.successor = successor;
    }
    @Override
    public void eventAction(String event, EventLevel eventLevel) {
        if (successor != null) {
            successor.eventAction(event, eventLevel);
        }
    }
}