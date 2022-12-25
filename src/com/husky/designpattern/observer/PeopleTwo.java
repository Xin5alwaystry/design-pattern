package com.husky.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author xin5
 * @date 2022年12月25日 19:54:50
 */
public class PeopleTwo implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("people two : " + arg);
    }
}
