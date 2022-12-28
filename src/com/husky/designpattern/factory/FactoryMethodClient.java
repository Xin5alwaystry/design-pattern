package com.husky.designpattern.factory;

/**
 * @author xin5
 * @since 2022年12月28日 19:35:33
 */
public class FactoryMethodClient {
    public static void main(String[] args) {
        AbstractFactoryMethod factoryMethod = new FactoryMethodA();
        factoryMethod.operation();

        factoryMethod = new FactoryMethodB();
        factoryMethod.operation();
    }
}
