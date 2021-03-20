package com.mitchell.factory.simplefactory;

import com.mitchell.factory.product.Apizza;
import com.mitchell.factory.product.Bpizza;
import com.mitchell.factory.product.Cpizza;
import com.mitchell.factory.product.Pizza;

/**
 * @author xin5
 * @date 2021年03月20日 22:14:11
 */
public class SimpleFactory {
    public Pizza createPizza(String type) {
        if ("A".equals(type)) {
            return new Apizza();
        } else if ("B".equals(type)) {
            return new Bpizza();
        } else {
            return new Cpizza();
        }
    }
}
