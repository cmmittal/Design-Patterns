package Creational.Factory.factory;

import Creational.Factory.button.Button;

public abstract class Dialog {

    public void render(){
        Button button = createButton();

        button.click();
    }
    
    public abstract Button createButton();
}
