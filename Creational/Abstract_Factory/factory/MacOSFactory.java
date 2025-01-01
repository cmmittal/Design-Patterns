package Creational.Abstract_Factory.factory;

import Creational.Abstract_Factory.button.Button;
import Creational.Abstract_Factory.button.MacOSButton;
import Creational.Abstract_Factory.icons.Icon;
import Creational.Abstract_Factory.icons.MacOSIcon;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton(){
        return new MacOSButton();
    }

    @Override
    public Icon createIcon(){
        return new MacOSIcon();
    }
}
