package com.mitchell.strategy;

/**
 * @author xin5
 * @date 2021年03月13日 00:15:19
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("quack!");
    }
}
