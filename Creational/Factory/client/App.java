package Creational.Factory.client;

import Creational.Factory.factory.Dialog;
import Creational.Factory.factory.MacOSDialog;
import Creational.Factory.factory.WindowsDialog;

public class App {

    static Dialog dialog;

    public static void main(String[] args){
        String os = "Windows";

        if (os.equals("Windows")) {
            dialog = new WindowsDialog();
        }
        else{
            dialog = new MacOSDialog();
        }

        dialog.render();
    }
}
