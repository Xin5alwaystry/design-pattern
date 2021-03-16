package com.mitchell.strategy.behavior;

/**
 * @author xin5
 * @date 2021年03月13日 00:16:36
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
