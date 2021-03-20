package com.mitchell.factory.product;

/**
 * @author xin5
 * @date 2021年03月20日 22:07:46
 */
public class Apizza implements Pizza {
    @Override
    public void description() {
        System.out.println("Pizza A.");
    }
}
