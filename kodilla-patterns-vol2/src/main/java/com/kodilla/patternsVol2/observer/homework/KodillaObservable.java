package com.kodilla.patternsVol2.observer.homework;

public interface KodillaObservable {
    void registerObserver(KodillaObserver kodillaObserver);
    void notifyObservers();
    void removeObserver(KodillaObserver kodillaObserver);
}
