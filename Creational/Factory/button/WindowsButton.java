package Creational.Factory.button;

public class WindowsButton implements Button{

    @Override
    public void click(){
        System.out.println("Clicked Windows Button");
    }
}