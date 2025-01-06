package Behavioural.Observer.client;

import Behavioural.Observer.publisher.Editor;
import Behavioural.Observer.subscriber.EmailEventListener;
import Behavioural.Observer.subscriber.LogEventListener;

public class App {

    public static void main(String[] args) throws InterruptedException{
        Editor editor = new Editor();
        editor.eventManager.subscribe("open", new LogEventListener());
        editor.eventManager.subscribe("save", new EmailEventListener());

        editor.openFile();
        editor.saveFile();
    }
}
