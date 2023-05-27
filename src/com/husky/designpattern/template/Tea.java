package com.husky.designpattern.template;

/**
 * @author xin5
 * @since 2023年05月27日 17:37:13
 */
public class Tea extends CaffeineBeverage {
    @Override
    void addCondiments() {
        System.out.println("Adding lemon.");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea.");
    }
}
