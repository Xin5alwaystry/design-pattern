package com.mitchell.observable.observer;

/**
 * @author xin5
 * @date 2021年03月16日 23:15:10
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
