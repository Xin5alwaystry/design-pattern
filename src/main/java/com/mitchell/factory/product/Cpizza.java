package com.mitchell.factory.product;

/**
 * @author xin5
 * @date 2021年03月20日 22:08:42
 */
public class Cpizza implements Pizza {
    @Override
    public void description() {
        System.out.println("Pizza C.");
    }
}
