package com.mitchell.decoration;

/**
 * @author xin5
 * @date 2021年03月18日 22:10:19
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
