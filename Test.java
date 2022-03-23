public class Test{
    public static void main(String[] args) {
        BaseEventHandler eventHandler = new BottonHandler();
        PanelHandler panelHandler = new PanelHandler();
        WindowHandler windowHandler = new WindowHandler();
        eventHandler.setNext(panelHandler);
        panelHandler.setNext(windowHandler);
        eventHandler.eventAction("click event", EventLevel.BOTTON);
        eventHandler.eventAction("reduces", EventLevel.PANEL);
        eventHandler.eventAction("close", EventLevel.WINDOW);
    }
}