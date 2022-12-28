package com.husky.designpattern.factory;

/**
 * @author xin5
 * @since 2022年12月28日 19:25:12
 */
public class SimpleFactory {
    public Product createProduct(String type) {
        if (type.equals("A")) {
            return new ProductA();
        } else {
            return new ProductB();
        }
    }
}
