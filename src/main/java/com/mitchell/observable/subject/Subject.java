package com.mitchell.observable.subject;

import com.mitchell.observable.observer.Observer;

/**
 * @author xin5
 * @date 2021年03月16日 23:12:55
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
