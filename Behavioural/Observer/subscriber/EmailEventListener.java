package Behavioural.Observer.subscriber;

public class EmailEventListener implements EventListener{

    @Override
    public void update(){
        System.out.println("Email update called");
    }
}
