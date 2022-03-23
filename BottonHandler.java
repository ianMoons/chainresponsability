public class BottonHandler extends BaseEventHandler {
    @Override
    public void eventAction(String event, EventLevel eventLevel) {
        if (eventLevel == eventLevel.BOTTON) {
            System.out.println(String.format("This is the button handler: '%s'", event));
        } else {
            super.eventAction(event, eventLevel);
        }
    }
}