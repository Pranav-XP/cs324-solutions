package dev.pranavtech.week4;

import java.util.ArrayList;

public class mySubject {
    private ArrayList<myObserver> observers = new ArrayList<myObserver>();

    public void addObserver(myObserver o) {
        observers.add(o);
    }

    public void removeObserver(myObserver o) {
        observers.remove(o);
    }

    protected void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
        }
    }
}
