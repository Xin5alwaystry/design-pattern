package com.mitchell.factory.factoryMethod;

import com.mitchell.factory.product.Pizza;

/**
 * @author xin5
 * @date 2021年03月20日 22:18:15
 */
public abstract class PizzaCreator {
    public Pizza getPizza(String type) {
        return createPizza(type);
    }

    public abstract Pizza createPizza(String type);
}
