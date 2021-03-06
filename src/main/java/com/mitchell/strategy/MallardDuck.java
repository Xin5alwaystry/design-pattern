package com.mitchell.strategy;

import com.mitchell.strategy.behavior.FlyWithWings;
import com.mitchell.strategy.behavior.Quack;

/**
 * @author xin5
 * @date 2021年03月13日 00:17:50
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck.");
    }
}
