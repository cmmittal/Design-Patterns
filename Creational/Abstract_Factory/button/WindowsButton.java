package Creational.Abstract_Factory.button;

public class WindowsButton implements Button{
    
    @Override
    public void press(){
        System.out.println("Using the Windows Button");
    }
}
