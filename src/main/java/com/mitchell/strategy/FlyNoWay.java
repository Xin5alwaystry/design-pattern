package com.mitchell.strategy;

/**
 * @author xin5
 * @date 2021年03月13日 00:13:51
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can not fly!");
    }
}
