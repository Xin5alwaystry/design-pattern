package com.mitchell.strategy;

/**
 * @author xin5
 * @date 2021年03月13日 00:17:27
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new Squeak());

        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
