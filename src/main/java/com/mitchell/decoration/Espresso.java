package com.mitchell.decoration;

/**
 * @author xin5
 * @date 2021年03月18日 22:09:29
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
