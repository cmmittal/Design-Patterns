package Creational.Abstract_Factory.factory;

import Creational.Abstract_Factory.button.Button;
import Creational.Abstract_Factory.icons.Icon;

public interface GUIFactory {
    public Button createButton();
    public Icon createIcon();
}
