package com.husky.designpattern.decorator.beverage;

import com.husky.designpattern.decorator.Beverage;

/**
 * @author xin5
 * @since 2022年12月26日 09:07:13
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House blend coffe";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
