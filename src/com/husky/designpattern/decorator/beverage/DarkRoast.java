package com.husky.designpattern.decorator.beverage;

import com.husky.designpattern.decorator.Beverage;

/**
 * @author xin5
 * @since 2022年12月26日 09:10:54
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark roast coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
