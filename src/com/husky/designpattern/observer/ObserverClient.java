package com.husky.designpattern.observer;

/**
 * @author xin5
 * @date 2022年12月25日 19:55:25
 */
public class ObserverClient {
    public static void main(String[] args) {
        NewspaperCompany company = new NewspaperCompany();
        PeopleOne one = new PeopleOne();
        PeopleTwo two = new PeopleTwo();
        company.addObserver(one);
        company.addObserver(two);
        company.setChanged();
        company.notifyObservers("发布今天的报纸");
    }
}
