package com.husky.designpattern.decorator.beverage;

import com.husky.designpattern.decorator.Beverage;

/**
 * @author xin5
 * @since 2022年12月26日 09:11:50
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
