package com.husky.designpattern.decorator;

/**
 * @author xin5
 * @since 2022年12月26日 09:05:15
 */
public abstract class Beverage {
    public String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
