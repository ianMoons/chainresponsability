public class PanelHandler extends BaseEventHandler {
    @Override
    public void eventAction(String event, EventLevel eventLevel) {
        if (eventLevel == eventLevel.PANEL) {
            System.out.println(String.format("This is the Panel handler: '%s'", event));
        } else {
            super.eventAction(event, eventLevel);
        }
    }
}