package com.mitchell.observable.subject;

import com.mitchell.observable.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xin5
 * @date 2021年03月16日 23:14:17
 */
public class WeatherData implements Subject {

    private float temp;
    private float humidity;
    private float pressure;
    private List<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = this.observerList.indexOf(observer);
        if (i >= 0) {
            this.observerList.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        if (this.observerList.size() <= 0) {
            return;
        }
        for (Observer observer : this.observerList) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementChanged() {
        this.notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementChanged();
    }
}
