package Behavioural.ChainOfResponsibility.middleware;

public class SecondMiddleWare extends MiddleWare{

    public boolean execute(){
        System.out.println("Executing Second MiddleWare");

        return execNext();
    }
}
