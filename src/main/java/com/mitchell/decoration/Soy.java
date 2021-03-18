package com.mitchell.decoration;

/**
 * @author xin5
 * @date 2021年03月18日 22:14:36
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + cost();
    }
}
