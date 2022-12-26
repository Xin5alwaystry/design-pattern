package com.husky.designpattern.decorator.decorator;

import com.husky.designpattern.decorator.Beverage;
import com.husky.designpattern.decorator.CondimentDecorator;

/**
 * @author xin5
 * @since 2022年12月26日 09:21:20
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
