package Observer;

import java.util.ArrayList;

public class Publisher implements PublisherInterface{

    private ArrayList<PublisherActionListener> listeners = new ArrayList<>();

    @Override
    public ArrayList<PublisherActionListener> getListeners() {
        return listeners;
    }

    @Override
    public void addListener(PublisherActionListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(PublisherActionListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeAllListener() {
        listeners.clear();
    }

    @Override
    public void notifySubscibers(String message) {
        for(PublisherActionListener actionListener:listeners){
            actionListener.doAction(message);
        }
    }

    public void createMessage(String message){
        System.out.println("Publisher printed message " + message);
        notifySubscibers(message);
    }
}
