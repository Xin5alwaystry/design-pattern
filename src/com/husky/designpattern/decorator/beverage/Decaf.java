package com.husky.designpattern.decorator.beverage;

import com.husky.designpattern.decorator.Beverage;

/**
 * @author xin5
 * @since 2022年12月26日 09:14:49
 */
public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
