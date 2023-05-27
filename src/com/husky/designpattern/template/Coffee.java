package com.husky.designpattern.template;

/**
 * @author xin5
 * @since 2023年05月27日 17:41:31
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk.");
    }

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter.");
    }
}
