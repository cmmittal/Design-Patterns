package Creational.Factory.factory;

import Creational.Factory.button.Button;
import Creational.Factory.button.MacOSButton;

public class MacOSDialog extends Dialog{

    @Override
    public Button createButton(){
        return new MacOSButton();
    }
}
