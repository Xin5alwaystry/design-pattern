package com.mitchell.observable.observer;

import com.mitchell.observable.subject.Subject;

/**
 * @author xin5
 * @date 2021年03月16日 23:38:35
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherDate;

    public CurrentConditionDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void display() {
        String content = String.format("Current condition: %s F degrees and %s percent humidity and %s pressure",
                this.temp, this.humidity, this.pressure);
        System.out.println(content);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }
}
