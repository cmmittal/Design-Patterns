package Behavioural.Observer.observer;

import Behavioural.Observer.subscriber.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    Map<String, List<EventListener>> subsMap = new HashMap<>();

    public EventManager(List<String> events){
        for (String event : events) {
            subsMap.put(event, new ArrayList<>());
        }
    }

    public void subscribe(String event, EventListener listener){
        List<EventListener> users = subsMap.get(event);

        users.add(listener);
    }

    public void unsubscribe(String event, EventListener listener){
        List<EventListener> users = subsMap.get(event);

        users.remove(listener);
    }

    public void notifySubs(String event){
        List<EventListener> subs = subsMap.get(event);

        for (EventListener listener : subs) {
            listener.update();
        }
    }
}
