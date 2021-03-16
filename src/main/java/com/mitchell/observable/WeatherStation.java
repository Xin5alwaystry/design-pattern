package com.mitchell.observable;

import com.mitchell.observable.observer.CurrentConditionDisplay;
import com.mitchell.observable.subject.WeatherData;

/**
 * @author xin5
 * @date 2021年03月16日 23:54:23
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(1, 2, 3);
    }
}
