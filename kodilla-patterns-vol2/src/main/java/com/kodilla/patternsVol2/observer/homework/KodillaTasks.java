package com.kodilla.patternsVol2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class KodillaTasks implements KodillaObservable {
    private final List<KodillaObserver> observers;
    private final List<String> tasks;
    private final String kodillaUsername;

    public KodillaTasks(String kodillaUsername) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.kodillaUsername = kodillaUsername;
    }
    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }
    @Override
    public void registerObserver(KodillaObserver kodillaObserver) {
        observers.add(kodillaObserver);
    }
    @Override
    public void notifyObservers() {
        for (KodillaObserver kodillaObserver : observers) {
            kodillaObserver.update(this);
        }
    }
    @Override
    public void removeObserver(KodillaObserver kodillaObserver) {
        observers.remove(kodillaObserver);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getKodillaUsername() {
        return kodillaUsername;
    }
}
