package Creational.Abstract_Factory.factory;

import Creational.Abstract_Factory.button.Button;
import Creational.Abstract_Factory.button.WindowsButton;
import Creational.Abstract_Factory.icons.Icon;
import Creational.Abstract_Factory.icons.WindowsIcon;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public Icon createIcon(){
        return new WindowsIcon();
    }
}
