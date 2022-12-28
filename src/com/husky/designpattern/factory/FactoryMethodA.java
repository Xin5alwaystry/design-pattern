package com.husky.designpattern.factory;

/**
 * @author xin5
 * @since 2022年12月28日 19:34:36
 */
public class FactoryMethodA extends AbstractFactoryMethod {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
