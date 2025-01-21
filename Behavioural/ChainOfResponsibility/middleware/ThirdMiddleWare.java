package Behavioural.ChainOfResponsibility.middleware;

public class ThirdMiddleWare extends MiddleWare{

    public boolean execute(){
        System.out.println("Executing Third MiddleWare");

        return execNext();
    }
}
