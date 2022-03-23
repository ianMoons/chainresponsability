public class WindowHandler extends BaseEventHandler {
    @Override
    public void eventAction(String event, EventLevel eventLevel) {
        if (eventLevel == eventLevel.WINDOW) {
            System.out.println(String.format("This is the window handle: '%s'", event));
        } else {
            super.eventAction(event, eventLevel);
        }
    }
}