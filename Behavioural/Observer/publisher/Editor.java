package Behavioural.Observer.publisher;

import java.util.Arrays;

import Behavioural.Observer.observer.EventManager;

public class Editor {

    public EventManager eventManager;

    public Editor(){
        eventManager = new EventManager(Arrays.asList("open", "save"));
    }

    public void openFile() throws InterruptedException{
        System.out.println("Opening a File......");
        Thread.sleep(1000);
        eventManager.notifySubs("open");
    }

    public void saveFile() throws InterruptedException{
        System.out.println("Saving a file......");
        Thread.sleep(1000);
        eventManager.notifySubs("save");
    }
}
