package com.mitchell.strategy.behavior;

/**
 * @author xin5
 * @date 2021年03月13日 00:15:54
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Silence");
    }
}
