package com.mitchell.decoration;

/**
 * @author xin5
 * @date 2021年03月18日 22:04:33
 */
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
