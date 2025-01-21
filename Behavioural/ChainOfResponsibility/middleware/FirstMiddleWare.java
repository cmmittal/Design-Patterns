package Behavioural.ChainOfResponsibility.middleware;

public class FirstMiddleWare extends MiddleWare{

    public boolean execute(){
        System.out.println("Executing first MiddleWare");

        return execNext();
    }
}
