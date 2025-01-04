package Creational.Factory.factory;

import Creational.Factory.button.Button;
import Creational.Factory.button.WindowsButton;

public class WindowsDialog extends Dialog{

    @Override
    public Button createButton(){
        return new WindowsButton();
    }
}
