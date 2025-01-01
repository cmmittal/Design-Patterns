package Creational.Abstract_Factory.config;

import Creational.Abstract_Factory.client.Application;
import Creational.Abstract_Factory.factory.GUIFactory;
import Creational.Abstract_Factory.factory.MacOSFactory;
import Creational.Abstract_Factory.factory.WindowsFactory;

public class Main {

    public static GUIFactory factory;

    public static void main(String[] args){

        String os = "Windows";

        if(os == "Windows"){
            factory = new WindowsFactory();
        }
        else {
            factory = new MacOSFactory();
        }

        Application application = new Application(factory);

        application.run();
    }
}