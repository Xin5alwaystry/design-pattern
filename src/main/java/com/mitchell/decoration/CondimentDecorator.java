package com.mitchell.decoration;

/**
 * @author xin5
 * @date 2021年03月18日 22:06:43
 */
public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
