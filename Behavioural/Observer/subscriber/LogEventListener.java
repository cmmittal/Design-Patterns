package Behavioural.Observer.subscriber;

public class LogEventListener implements EventListener{

    @Override
    public void update(){
        System.out.println("Log Update Called");
    }
}
