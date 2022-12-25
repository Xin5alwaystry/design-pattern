package com.husky.designpattern.observer;

import java.util.Observable;

/**
 * @author xin5
 * @date 2022年12月25日 19:48:36
 */
public class NewspaperCompany extends Observable {
    @Override
    protected synchronized void setChanged() {
        super.setChanged();
    }
}
