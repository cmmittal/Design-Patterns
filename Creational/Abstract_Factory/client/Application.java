package Creational.Abstract_Factory.client;

import Creational.Abstract_Factory.button.Button;
import Creational.Abstract_Factory.factory.GUIFactory;

public class Application {

    public GUIFactory factory;
    public Button button;

    public Application(GUIFactory factory){
        this.factory = factory;
    }

    public void run(){
        button = factory.createButton();
        button.press();
        factory.createIcon();
    }
}
